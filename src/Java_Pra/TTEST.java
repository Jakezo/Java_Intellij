package Java_Pra;

public class TTEST {

    <div class="form-group row">
															<label class="col-xl-3 col-lg-3 col-form-label">배송비 결제 방식</label>
															<div class="col-lg-9 col-xl-9">
																<select class="form-control kt-input" id="DLV_PAY" name="DLV_PAY">
																	<option value="착불" <c:if test="${empty biz.DLV_PAY or '착불' eq biz.DLV_PAY }">selected="selected"</c:if>>착불</option>
																	<option value="선결제" <c:if test="${ '선결제' eq biz.DLV_PAY }">selected="selected"</c:if>>선결제</option>
																	<option value="착불 또는 선결제" <c:if test="${ '착불 또는 선결제' eq biz.DLV_PAY }">selected="selected"</c:if>>착불 또는 선결제</option>
																</select>
																<span class="form-text text-muted"><code>배송비 결제 방식은 필수 입력사항 입니다.</code></span>
															</div>
														</div>
														<div class="form-group row">
															<label class="col-xl-3 col-lg-3 col-form-label">기본 배송비</label>
															<div class="col-lg-9 col-xl-9">
																<c:set var="BAS_FEE" value="0" />
																<c:if test="${! empty biz.BAS_FEE}"><c:set var="BAS_FEE" value="${biz.BAS_FEE}" /></c:if>
																<input class="form-control" type="text" id="BAS_FEE" name="BAS_FEE" value="<c:out value="${BAS_FEE}"/>">
																<span class="form-text text-muted"><code>기본 배송비는 필수 입력사항 입니다.</code></span>
															</div>
														</div>
													</div>
}
