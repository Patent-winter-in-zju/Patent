package cn.zju.visualization.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "patent")
public class Patent implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String applyNumber;
	private String name;
	private String mainClassifyCode;
	private String classifyCode;
	private String applyMan;
	private String inventeMan;
	private String publicityDate;
	private String publicityCode;
	private String patentAgent;
	private String agent;
	private String apllyDate;
	private String address;
	private String priority;
	private String provinceCode;
	private String summary;
	private String mainRight;
	private String internationalApply;
	private String internationalPublicity;
	private String patentId;
	private String categoryClassification;
	private String referencess;
	private String source;
	private String countryCode;
	private String pageNumber;
	private String examiner;
	private String path;
	private String type;

	@Override
	public String toString() {
		return "Patent [id=" + id + ", applyNumber=" + applyNumber + ", name=" + name + ", mainClassifyCode="
				+ mainClassifyCode + ", classifyCode=" + classifyCode + ", applyMan=" + applyMan + ", inventeMan="
				+ inventeMan + ", publicityDate=" + publicityDate + ", publicityCode=" + publicityCode
				+ ", patentAgent=" + patentAgent + ", agent=" + agent + ", apllyDate=" + apllyDate + ", address="
				+ address + ", priority=" + priority + ", provinceCode=" + provinceCode + ", summary=" + summary
				+ ", mainRight=" + mainRight + ", internationalApply=" + internationalApply
				+ ", internationalPublicity=" + internationalPublicity + ", patentId=" + patentId
				+ ", categoryClassification=" + categoryClassification + ", referencess=" + referencess + ", source="
				+ source + ", countryCode=" + countryCode + ", pageNumber=" + pageNumber + ", examiner=" + examiner
				+ ", path=" + path + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplyNumber() {
		return applyNumber;
	}

	public void setApplyNumber(String applyNumber) {
		this.applyNumber = applyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainClassifyCode() {
		return mainClassifyCode;
	}

	public void setMainClassifyCode(String mainClassifyCode) {
		this.mainClassifyCode = mainClassifyCode;
	}

	public String getClassifyCode() {
		return classifyCode;
	}

	public void setClassifyCode(String classifyCode) {
		this.classifyCode = classifyCode;
	}

	public String getApplyMan() {
		return applyMan;
	}

	public void setApplyMan(String applyMan) {
		this.applyMan = applyMan;
	}

	public String getInventeMan() {
		return inventeMan;
	}

	public void setInventeMan(String inventeMan) {
		this.inventeMan = inventeMan;
	}

	public String getPublicityDate() {
		return publicityDate;
	}

	public void setPublicityDate(String publicityDate) {
		this.publicityDate = publicityDate;
	}

	public String getPublicityCode() {
		return publicityCode;
	}

	public void setPublicityCode(String publicityCode) {
		this.publicityCode = publicityCode;
	}

	public String getPatentAgent() {
		return patentAgent;
	}

	public void setPatentAgent(String patentAgent) {
		this.patentAgent = patentAgent;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getApllyDate() {
		return apllyDate;
	}

	public void setApllyDate(String apllyDate) {
		this.apllyDate = apllyDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getMainRight() {
		return mainRight;
	}

	public void setMainRight(String mainRight) {
		this.mainRight = mainRight;
	}

	public String getInternationalApply() {
		return internationalApply;
	}

	public void setInternationalApply(String internationalApply) {
		this.internationalApply = internationalApply;
	}

	public String getInternationalPublicity() {
		return internationalPublicity;
	}

	public void setInternationalPublicity(String internationalPublicity) {
		this.internationalPublicity = internationalPublicity;
	}

	public String getPatentId() {
		return patentId;
	}

	public void setPatentId(String patentId) {
		this.patentId = patentId;
	}

	public String getCategoryClassification() {
		return categoryClassification;
	}

	public void setCategoryClassification(String categoryClassification) {
		this.categoryClassification = categoryClassification;
	}

	public String getReferencess() {
		return referencess;
	}

	public void setReferencess(String referencess) {
		this.referencess = referencess;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getExaminer() {
		return examiner;
	}

	public void setExaminer(String examiner) {
		this.examiner = examiner;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
