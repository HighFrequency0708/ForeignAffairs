package com.dapain.foreignAffairs.web.query;

import org.apache.commons.lang3.StringUtils;
import com.ibeetl.admin.core.annotation.Query;
import com.ibeetl.admin.core.util.Tool;
import com.ibeetl.admin.core.util.enums.CoreDictType;
import com.ibeetl.admin.core.web.query.PageParam;
import java.util.Date;
/**
 *FaStudent查询
 */
public class FaStudentQuery extends PageParam {
    @Query(name = "学生学号", display = true)
    private String studentId;
    @Query(name = "接收院校", display = true)
    private String hostInstitution;
    @Query(name = "姓名", display = true)
    private String name;
    @Query(name = "姓", display = true)
    private String familyName;
    @Query(name = "名", display = true)
    private String givenNames;
    @Query(name = "国籍", display = true)
    private String nationality;
    @Query(name = "护照号码", display = true)
    private String passportNo;
    @Query(name = "性别", display = true,type=Query.TYPE_DICT,dict="gender")
    private String sex;
    @Query(name = "婚否", display = true)
    private String maritalStatus;
    @Query(name = "出生日期", display = true)
    private String dateOfBirth;
    @Query(name = "出生地点", display = true)
    private String placeOfBirth;
    @Query(name = "家庭地址", display = true)
    private String homeAddr;
    @Query(name = "家庭电话", display = true)
    private String telAddr;
    @Query(name = "最高学历", display = true)
    private String hado;
    @Query(name = "职业", display = true)
    private String occupation;
    @Query(name = "所在单位", display = true)
    private String eoia;
    @Query(name = "学习专业", display = true)
    private String fosic;
    @Query(name = "开始年月", display = true)
    private String fosicStart;
    @Query(name = "结束年月", display = true)
    private String fosicEnd;
    @Query(name = "学生类别", display = true)
    private String studentStatus;
    @Query(name = "注册截至日", display = true)
    private String dfrDay;
    @Query(name = "推荐人单位", display = true)
    private String reference;
    @Query(name = "推荐人电话", display = true)
    private String referenceTel;
    @Query(name = "在华担保人", display = true)
    private String guarantorChina;
    @Query(name = "电话：在华", display = true)
    private String guarantorTel;
    @Query(name = "经费来源", display = true,type=Query.TYPE_DICT,dict="financial_funding")
    private String financialFunding;
    @Query(name = "经济担保人", display = true)
    private String fswbpb;
    @Query(name = "电话：经济", display = true)
    private String fswbpbTel;
    public String getStudentId(){
        return  studentId;
    }
    public void setStudentId(String studentId ){
        this.studentId = studentId;
    }
    public String getHostInstitution(){
        return  hostInstitution;
    }
    public void setHostInstitution(String hostInstitution ){
        this.hostInstitution = hostInstitution;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name ){
        this.name = name;
    }
    public String getFamilyName(){
        return  familyName;
    }
    public void setFamilyName(String familyName ){
        this.familyName = familyName;
    }
    public String getGivenNames(){
        return  givenNames;
    }
    public void setGivenNames(String givenNames ){
        this.givenNames = givenNames;
    }
    public String getNationality(){
        return  nationality;
    }
    public void setNationality(String nationality ){
        this.nationality = nationality;
    }
    public String getPassportNo(){
        return  passportNo;
    }
    public void setPassportNo(String passportNo ){
        this.passportNo = passportNo;
    }
    public String getSex(){
        return  sex;
    }
    public void setSex(String sex ){
        this.sex = sex;
    }
    public String getMaritalStatus(){
        return  maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus ){
        this.maritalStatus = maritalStatus;
    }
    public String getDateOfBirth(){
        return  dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth ){
        this.dateOfBirth = dateOfBirth;
    }
    public String getPlaceOfBirth(){
        return  placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth ){
        this.placeOfBirth = placeOfBirth;
    }
    public String getHomeAddr(){
        return  homeAddr;
    }
    public void setHomeAddr(String homeAddr ){
        this.homeAddr = homeAddr;
    }
    public String getTelAddr(){
        return  telAddr;
    }
    public void setTelAddr(String telAddr ){
        this.telAddr = telAddr;
    }
    public String getHado(){
        return  hado;
    }
    public void setHado(String hado ){
        this.hado = hado;
    }
    public String getOccupation(){
        return  occupation;
    }
    public void setOccupation(String occupation ){
        this.occupation = occupation;
    }
    public String getEoia(){
        return  eoia;
    }
    public void setEoia(String eoia ){
        this.eoia = eoia;
    }
    public String getFosic(){
        return  fosic;
    }
    public void setFosic(String fosic ){
        this.fosic = fosic;
    }
    public String getFosicStart(){
        return  fosicStart;
    }
    public void setFosicStart(String fosicStart ){
        this.fosicStart = fosicStart;
    }
    public String getFosicEnd(){
        return  fosicEnd;
    }
    public void setFosicEnd(String fosicEnd ){
        this.fosicEnd = fosicEnd;
    }
    public String getStudentStatus(){
        return  studentStatus;
    }
    public void setStudentStatus(String studentStatus ){
        this.studentStatus = studentStatus;
    }
    public String getDfrDay(){
        return  dfrDay;
    }
    public void setDfrDay(String dfrDay ){
        this.dfrDay = dfrDay;
    }
    public String getReference(){
        return  reference;
    }
    public void setReference(String reference ){
        this.reference = reference;
    }
    public String getReferenceTel(){
        return  referenceTel;
    }
    public void setReferenceTel(String referenceTel ){
        this.referenceTel = referenceTel;
    }
    public String getGuarantorChina(){
        return  guarantorChina;
    }
    public void setGuarantorChina(String guarantorChina ){
        this.guarantorChina = guarantorChina;
    }
    public String getGuarantorTel(){
        return  guarantorTel;
    }
    public void setGuarantorTel(String guarantorTel ){
        this.guarantorTel = guarantorTel;
    }
    public String getFinancialFunding(){
        return  financialFunding;
    }
    public void setFinancialFunding(String financialFunding ){
        this.financialFunding = financialFunding;
    }
	public String getFswbpb() {
		return fswbpb;
	}
	public void setFswbpb(String fswbpb) {
		this.fswbpb = fswbpb;
	}
	public String getFswbpbTel() {
		return fswbpbTel;
	}
	public void setFswbpbTel(String fswbpbTel) {
		this.fswbpbTel = fswbpbTel;
	}
 
}
