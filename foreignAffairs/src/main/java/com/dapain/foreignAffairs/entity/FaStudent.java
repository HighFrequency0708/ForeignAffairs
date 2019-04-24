package com.dapain.foreignAffairs.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.beetl.sql.core.annotatoin.AutoID;
import org.beetl.sql.core.annotatoin.SeqID;

import com.ibeetl.admin.core.util.ValidateConfig;

import org.beetl.sql.core.TailBean;
import java.math.*;

import com.ibeetl.admin.core.annotation.Dict;
import com.ibeetl.admin.core.annotation.Query;
import com.ibeetl.admin.core.entity.BaseEntity;

import org.beetl.sql.core.annotatoin.InsertIgnore;
import org.beetl.sql.core.annotatoin.Version;
import org.beetl.sql.core.annotatoin.LogicDelete;


/* 
* 
* gen by Spring Boot2 Admin 2019-04-17
*/
public class FaStudent extends BaseEntity{

    @NotNull(message = "ID不能为空", groups =ValidateConfig.UPDATE.class)
    @SeqID(name = ORACLE_CORE_SEQ_NAME)
    @AutoID	

    private Integer id ;
	

    private String studentId ;
	

    private String hostInstitution ;
	

    private String name ;
	

    private String familyName ;
	

    private String givenNames ;
	

    private String nationality ;
	

    private String passportNo ;
	
    @Dict(type="gender")

    private String sex ;
	

    private String maritalStatus ;
	

    private String dateOfBirth ;
	

    private String placeOfBirth ;
	

    private String homeAddr ;
	

    private String telAddr ;
	

    private String hado ;
	

    private String occupation ;
	

    private String eoia ;
	

    private String fosic ;
	

    private String fosicStart ;
	

    private String fosicEnd ;
	

    private String studentStatus ;
	

    private String dfrDay ;
	

    private String reference ;
	

    private String referenceTel ;
	

    private String guarantorChina ;
	

    private String guarantorTel ;
	
    @Dict(type="financial_funding")
    private String financialFunding ;

    private String fswbpb;

    private String fswbpbTel;
    
    public FaStudent()
    {
    }

    public Integer getId(){
	    return  id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getStudentId(){
	    return  studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getHostInstitution(){
	    return  hostInstitution;
    }
    public void setHostInstitution(String hostInstitution){
        this.hostInstitution = hostInstitution;
    }

    public String getName(){
	    return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getFamilyName(){
	    return  familyName;
    }
    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public String getGivenNames(){
	    return  givenNames;
    }
    public void setGivenNames(String givenNames){
        this.givenNames = givenNames;
    }

    public String getNationality(){
	    return  nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getPassportNo(){
	    return  passportNo;
    }
    public void setPassportNo(String passportNo){
        this.passportNo = passportNo;
    }

    public String getSex(){
	    return  sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public String getMaritalStatus(){
	    return  maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }

    public String getDateOfBirth(){
	    return  dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth(){
	    return  placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth){
        this.placeOfBirth = placeOfBirth;
    }

    public String getHomeAddr(){
	    return  homeAddr;
    }
    public void setHomeAddr(String homeAddr){
        this.homeAddr = homeAddr;
    }

    public String getTelAddr(){
	    return  telAddr;
    }
    public void setTelAddr(String telAddr){
        this.telAddr = telAddr;
    }

    public String getHado(){
	    return  hado;
    }
    public void setHado(String hado){
        this.hado = hado;
    }

    public String getOccupation(){
	    return  occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getEoia(){
	    return  eoia;
    }
    public void setEoia(String eoia){
        this.eoia = eoia;
    }

    public String getFosic(){
	    return  fosic;
    }
    public void setFosic(String fosic){
        this.fosic = fosic;
    }

    public String getFosicStart(){
	    return  fosicStart;
    }
    public void setFosicStart(String fosicStart){
        this.fosicStart = fosicStart;
    }

    public String getFosicEnd(){
	    return  fosicEnd;
    }
    public void setFosicEnd(String fosicEnd){
        this.fosicEnd = fosicEnd;
    }

    public String getStudentStatus(){
	    return  studentStatus;
    }
    public void setStudentStatus(String studentStatus){
        this.studentStatus = studentStatus;
    }

    public String getDfrDay(){
	    return  dfrDay;
    }
    public void setDfrDay(String dfrDay){
        this.dfrDay = dfrDay;
    }

    public String getReference(){
	    return  reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    public String getReferenceTel(){
	    return  referenceTel;
    }
    public void setReferenceTel(String referenceTel){
        this.referenceTel = referenceTel;
    }

    public String getGuarantorChina(){
	    return  guarantorChina;
    }
    public void setGuarantorChina(String guarantorChina){
        this.guarantorChina = guarantorChina;
    }

    public String getGuarantorTel(){
	    return  guarantorTel;
    }
    public void setGuarantorTel(String guarantorTel){
        this.guarantorTel = guarantorTel;
    }

    public String getFinancialFunding(){
	    return  financialFunding;
    }
    public void setFinancialFunding(String financialFunding){
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
