package violin.domain;

public class Evaluation {
private Integer id;
private String order_sn;
private String evaluation;
private String image1;
private String image2;
//private String image3;
//private String image4;
private Integer logistics;
private Integer quality;
private Integer service;
public Evaluation(){
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getOrder_sn() {
	return order_sn;
}
public void setOrder_sn(String order_sn) {
	this.order_sn = order_sn;
}
public String getEvaluation() {
	return evaluation;
}
public void setEvaluation(String evaluation) {
	this.evaluation = evaluation;
}
public String getImage1() {
	return image1;
}
public void setImage1(String image1) {
	this.image1 = image1;
}
public String getImage2() {
	return image2;
}
public void setImage2(String image2) {
	this.image2 = image2;
}
//public String getImage3() {
//	return image3;
//}
//public void setImage3(String image3) {
//	this.image3 = image3;
//}
//public String getImage4() {
//	return image4;
//}
//public void setImage4(String image4) {
//	this.image4 = image4;
//}

public Integer getLogistics() {
	return logistics;
}
public void setLogistics(Integer logistics) {
	this.logistics = logistics;
}
public Integer getQuality() {
	return quality;
}
public void setQuality(Integer quality) {
	this.quality = quality;
}
public Integer getService() {
	return service;
}
public void setService(Integer service) {
	this.service = service;
}
@Override
public String toString() {
return "Evaluation [id=" + id + ", order_sn=" + order_sn + ","
		+ " evaluation=" + evaluation+", image1=" + image1+","
		+ " image2=" + image2+",  logistics=" + logistics+", quality=" + quality+", service=" + service+"]";
}
}