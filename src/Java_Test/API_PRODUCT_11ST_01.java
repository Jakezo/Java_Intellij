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


public class API_PRODUCT_11ST_01 {

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
            NodeList nList = doc.getElementsByTagName("Category");
            System.out.println("개수:"+nList.getLength());
            for(int temp = 0; temp < nList.getLength(); ++temp) {
                Node nNode = nList.item(temp);
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println(temp+"번째");
                    System.out.println("CategoryName:"+getValue("CategoryName",eElement));
                    System.out.println("CategoryUrl:"+getValue("CategoryUrl",eElement));
                    System.out.println("카테고리별 갯수:"+getValue("CategoryPrdCnt",eElement));
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
            String urlstr="http://api.11st.co.kr/rest/prodservices/product";
            String openapikey ="gty457h547rtyd456h78gy7456h758r5";


            URL url = new URL(urlstr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setConnectTimeout(5000); //서버에 연결되는 Timeout 시간 설정
            con.setReadTimeout(5000); // InputStream 읽어 오는 Timeout 시간 설정

            con.setRequestMethod("POST");

            //URLConnection에 대한 doOutput 필드값을 지정된 값으로 설정한다. URL 연결은 입출력에 사용될 수 있다.
            // URL 연결을 출력용으로 사용하려는 경우 DoOutput 플래그를 true로 설정하고, 그렇지 않은 경우는 false로 설정해야 한다. 기본값은 false이다.

            con.setDoOutput(false);

            StringBuffer buffer = new StringBuffer("<?xml version=\"1.0\" encoding=\"EUC-KR\"?>");

            StringBuilder sb = new StringBuilder();
            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //Stream을 처리해줘야 한다.
                BufferedReader br2 = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), "EUC-KR"));  // xml 은 EUC-KR 로 인코딩
                String line;
                while ((line = br2.readLine()) != null) {
                    buffer.append("<Product>");
                    buffer.append("<abrdBuyPlace>B</abrdBuyPlace>"); //너무 많아서 생략
                    buffer.append("<selMthdCd>01</selMthdCd>");
                    buffer.append("<dispCtgrNo>1010294</dispCtgrNo>");
                    buffer.append("<prdTypCd>01</prdTypCd>");
                    buffer.append("</Product>");
                    buffer.append(line).append("\n");
                }
                br2.close();
                System.out.println("" + buffer.toString());
                ParsingXML(urlstr);

            } else {
                System.out.println(con.getResponseMessage());
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }



    }
    }

