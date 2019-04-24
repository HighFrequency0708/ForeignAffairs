queryByCondition
===


    select 
    @pageTag(){
    t.*
    @}
    from fa_student t
    where 1=1
    @//数据权限，该sql语句功能点  
    and #function("faStudent.query")#
    @if(!isEmpty(studentId)){
        and  t.student_id =#studentId#
    @}
    @if(!isEmpty(hostInstitution)){
        and  t.host_institution =#hostInstitution#
    @}
    @if(!isEmpty(name)){
        and  t.name =#name#
    @}
    @if(!isEmpty(familyName)){
        and  t.family_name =#familyName#
    @}
    @if(!isEmpty(givenNames)){
        and  t.given_names =#givenNames#
    @}
    @if(!isEmpty(nationality)){
        and  t.nationality =#nationality#
    @}
    @if(!isEmpty(passportNo)){
        and  t.passport_no =#passportNo#
    @}
    @if(!isEmpty(sex)){
        and  t.sex =#sex#
    @}
    @if(!isEmpty(maritalStatus)){
        and  t.marital_status =#maritalStatus#
    @}
    @if(!isEmpty(dateOfBirth)){
        and  t.date_of_birth =#dateOfBirth#
    @}
    @if(!isEmpty(placeOfBirth)){
        and  t.place_of_birth =#placeOfBirth#
    @}
    @if(!isEmpty(homeAddr)){
        and  t.home_addr =#homeAddr#
    @}
    @if(!isEmpty(telAddr)){
        and  t.tel_addr =#telAddr#
    @}
    @if(!isEmpty(hado)){
        and  t.hado =#hado#
    @}
    @if(!isEmpty(occupation)){
        and  t.occupation =#occupation#
    @}
    @if(!isEmpty(eoia)){
        and  t.eoia =#eoia#
    @}
    @if(!isEmpty(fosic)){
        and  t.fosic =#fosic#
    @}
    @if(!isEmpty(fosicStart)){
        and  t.fosic_Start =#fosicStart#
    @}
    @if(!isEmpty(fosicEnd)){
        and  t.fosic_end =#fosicEnd#
    @}
    @if(!isEmpty(studentStatus)){
        and  t.student_status =#studentStatus#
    @}
    @if(!isEmpty(dfrDay)){
        and  t.dfr_day =#dfrDay#
    @}
    @if(!isEmpty(reference)){
        and  t.reference =#reference#
    @}
    @if(!isEmpty(referenceTel)){
        and  t.reference_tel =#referenceTel#
    @}
    @if(!isEmpty(guarantorChina)){
        and  t.guarantor_china =#guarantorChina#
    @}
    @if(!isEmpty(guarantorTel)){
        and  t.guarantor_tel =#guarantorTel#
    @}
    @if(!isEmpty(financialFunding)){
        and  t.financial_funding =#financialFunding#
    @}
    @if(!isEmpty(fswbpb)){
        and  t.fswbpb =#fswbpb#
    @}
    @if(!isEmpty(fswbpbTel)){
        and  t.fswbpbTel =#fswbpbTel#
    @}
    
    
    

batchDelFaStudentByIds
===

* 批量逻辑删除

    delete from fa_student where id in ( #join(ids)# )
    
