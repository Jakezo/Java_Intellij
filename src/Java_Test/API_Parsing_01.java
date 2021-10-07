package Java_Test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 공공 데이터 Api Xml 파싱 테스트
public class API_Parsing_01 {

    public static String getValue(String item, Element eElement) {

        // 몇몇 태그가 없는 경우도 있기 때문에 체크한다
        if(null == eElement) {
            return null;
        }

        if(null == eElement.getElementsByTagName(item)) {
            return null;
        }

        if(null == eElement.getElementsByTagName(item).item(0)) {
            return null;
        }

        NodeList nlList =  eElement.getElementsByTagName(item).item(0).getChildNodes();
        Node nValue = (Node)nlList.item(0);
        if(nValue == null)
            return null;

        return nValue.getNodeValue();
    }

    public static void ParsingXML(String result) {
        DocumentBuilderFactory dbFactory =  DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = (Document) dBuilder.parse(result);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :  "+doc.getDocumentElement().getNodeName());

            // Category 태그로 묶여진 데이터들을 전부 가져온다
            NodeList nList = doc.getElementsByTagName("ns2:category");

            NodeList nList2 = doc.getElementsByTagName("ns2:category");

            System.out.println("개수:"+nList.getLength());
            int a =0;
            List<Map<String, String>> list = new ArrayList<>();
            for(int temp = 0; temp < nList.getLength(); ++temp) {
                Map<String, String> map = new HashMap<>();
                Node nNode = nList.item(temp);
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    String equ = getValue("parentDispNo", eElement);
                    if(equ.equals("0")) {
                        a++;
                        System.out.println("개수우" + a);
//                        System.out.println(temp + "번째");
                        System.out.println("dispNm" + getValue("dispNm", eElement));
                        System.out.println("depth:" + getValue("depth", eElement));
                        map.put("dispNm" ,getValue("dispNm", eElement));

                        list.add(map);
                    }
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String clientKey = "f498c4b542bf9c60638b673bd45e8077";
            String keyWord = "ㅇㅇㅇ";
            String keyname = URLEncoder.encode(keyWord, "UTF-8");
            String urlstr="http://api.11st.co.kr/rest/cateservice/category";


            URL url = new URL(urlstr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000); //서버에 연결되는 Timeout 시간 설정
            con.setReadTimeout(5000); // InputStream 읽어 오는 Timeout 시간 설정

            con.setRequestMethod("GET");

            //URLConnection에 대한 doOutput 필드값을 지정된 값으로 설정한다. URL 연결은 입출력에 사용될 수 있다.
            // URL 연결을 출력용으로 사용하려는 경우 DoOutput 플래그를 true로 설정하고, 그렇지 않은 경우는 false로 설정해야 한다. 기본값은 false이다.

            con.setDoOutput(false);

            StringBuilder sb = new StringBuilder();
            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //Stream을 처리해줘야 한다.
                BufferedReader br2 = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "EUC-KR"));  // xml 은 EUC-KR 로 인코딩
                String line;
                while ((line = br2.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                br2.close();
//                System.out.println("" + sb.toString());
                ParsingXML(urlstr);

            } else {
                System.out.println(con.getResponseMessage());
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
