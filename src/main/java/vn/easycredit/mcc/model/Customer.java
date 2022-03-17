package vn.easycredit.mcc.model;
/**
 * This class was automatically generated by the data modeler tool.
 */
import java.io.Serializable;
import java.util.Map;

public class Customer implements Serializable{
	 static final long serialVersionUID = 1L;

    private String contractNumber;
    private String custId;
    private String partnerCode;
    private String fullName;
    private String idNumber;
    private String otherIdNumber;
    private String phoneNumber;
    private String gender;
    private String dateOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private String issuePlace;
    private String dateOfIssue;
    private String monthOfIssue;
    private String yearOfIssue;
    private double totalMonthlyNetIncome;
    private double otherIncome;
    private double totalMonthlyExpenses;


    private String employmentType;
    private String productGroup;
    private String documentsProvide;
    private long requestAmount;
    private int tenor;

    private Address address;
    private Reference reference;

    private Disbursement disbursement;
    private Contact contact;
    
    private Map<String, Map<String,Map<String,Object>>> data;
    
    private  Map<String,Object> score ;
    private String prdctRiskClass;
    private String saleChannel;
    private String saleNetwork;
    private String submittedBy;
    public Customer() {}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getOtherIdNumber() {
		return otherIdNumber;
	}
	public void setOtherIdNumber(String otherIdNumber) {
		this.otherIdNumber = otherIdNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMonthOfBirth() {
		return monthOfBirth;
	}
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getIssuePlace() {
		return issuePlace;
	}
	public void setIssuePlace(String issuePlace) {
		this.issuePlace = issuePlace;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getMonthOfIssue() {
		return monthOfIssue;
	}
	public void setMonthOfIssue(String monthOfIssue) {
		this.monthOfIssue = monthOfIssue;
	}
	public String getYearOfIssue() {
		return yearOfIssue;
	}
	public void setYearOfIssue(String yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}
	public double getTotalMonthlyNetIncome() {
		return totalMonthlyNetIncome;
	}
	public void setTotalMonthlyNetIncome(double totalMonthlyNetIncome) {
		this.totalMonthlyNetIncome = totalMonthlyNetIncome;
	}
	public double getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(double otherIncome) {
		this.otherIncome = otherIncome;
	}
	public double getTotalMonthlyExpenses() {
		return totalMonthlyExpenses;
	}
	public void setTotalMonthlyExpenses(double totalMonthlyExpenses) {
		this.totalMonthlyExpenses = totalMonthlyExpenses;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public String getDocumentsProvide() {
		return documentsProvide;
	}
	public void setDocumentsProvide(String documentsProvide) {
		this.documentsProvide = documentsProvide;
	}
	public long getRequestAmount() {
		return requestAmount;
	}
	public void setRequestAmount(long requestAmount) {
		this.requestAmount = requestAmount;
	}
	public int getTenor() {
		return tenor;
	}
	public void setTenor(int tenor) {
		this.tenor = tenor;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Reference getReference() {
		return reference;
	}
	public void setReference(Reference reference) {
		this.reference = reference;
	}
	public Disbursement getDisbursement() {
		return disbursement;
	}
	public void setDisbursement(Disbursement disbursement) {
		this.disbursement = disbursement;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Map<String, Map<String, Map<String, Object>>> getData() {
		return data;
	}
	public void setData(Map<String, Map<String, Map<String, Object>>> data) {
		this.data = data;
	}
	public Map<String, Object> getScore() {
		return score;
	}
	public void setScore(Map<String, Object> score) {
		this.score = score;
	}
	public String getPrdctRiskClass() {
		return prdctRiskClass;
	}
	public void setPrdctRiskClass(String prdctRiskClass) {
		this.prdctRiskClass = prdctRiskClass;
	}
	public String getSaleChannel() {
		return saleChannel;
	}
	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}
	public String getSaleNetwork() {
		return saleNetwork;
	}
	public void setSaleNetwork(String saleNetwork) {
		this.saleNetwork = saleNetwork;
	}
	public String getSubmittedBy() {
		return submittedBy;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	public Customer(String contractNumber, String custId, String partnerCode, String fullName, String idNumber,
			String otherIdNumber, String phoneNumber, String gender, String dateOfBirth, String monthOfBirth,
			String yearOfBirth, String issuePlace, String dateOfIssue, String monthOfIssue, String yearOfIssue,
			double totalMonthlyNetIncome, double otherIncome, double totalMonthlyExpenses, String employmentType,
			String productGroup, String documentsProvide, long requestAmount, int tenor, Address address,
			Reference reference, Disbursement disbursement, Contact contact,
			Map<String, Map<String, Map<String, Object>>> data, Map<String, Object> score, String prdctRiskClass,
			String saleChannel, String saleNetwork, String submittedBy) {
		super();
		this.contractNumber = contractNumber;
		this.custId = custId;
		this.partnerCode = partnerCode;
		this.fullName = fullName;
		this.idNumber = idNumber;
		this.otherIdNumber = otherIdNumber;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.issuePlace = issuePlace;
		this.dateOfIssue = dateOfIssue;
		this.monthOfIssue = monthOfIssue;
		this.yearOfIssue = yearOfIssue;
		this.totalMonthlyNetIncome = totalMonthlyNetIncome;
		this.otherIncome = otherIncome;
		this.totalMonthlyExpenses = totalMonthlyExpenses;
		this.employmentType = employmentType;
		this.productGroup = productGroup;
		this.documentsProvide = documentsProvide;
		this.requestAmount = requestAmount;
		this.tenor = tenor;
		this.address = address;
		this.reference = reference;
		this.disbursement = disbursement;
		this.contact = contact;
		this.data = data;
		this.score = score;
		this.prdctRiskClass = prdctRiskClass;
		this.saleChannel = saleChannel;
		this.saleNetwork = saleNetwork;
		this.submittedBy = submittedBy;
	}
    
    
	
}
