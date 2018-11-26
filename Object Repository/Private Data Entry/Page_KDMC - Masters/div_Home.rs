<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Home</name>
   <tag></tag>
   <elementGuidId>58d3ab7e-0ecf-4a38-bb8c-0fd498b5904a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                            

                                
                                    Home 
                                    
                                    
                                



                            
                            


    
        
            
        
    
    



    
        


            
                
                    ×
                    Payment Details

                
                

                    


                        
                    

                    
                    
                        
                            Amount* 
                        
                        
                            
                        
                    
                    
                    
                        Close
                        
                    
                

            
        
    



    


    
        
            
                
                    
                        ×
                        View Details
                        
                        
                            
                                Hospital Name:
                                    
                                
                            
                            
                                Applicant Name:
                            
                            
                                Registered Date:
                            
                        
                    
                    
                        
                            
                                
                                    Res.Tel. No: 
                                    
                                
                                
                                    Address: 
                                    
                                
                                
                                    Nationality: 
                                    
                                
                            
                             
                            
                                
                                    Suit of Regn: 
                                    
                                
                                
                                    Name Other: 
                                    
                                
                                
                                    Place: 
                                    
                                

                            
                             
                            
                                
                                    Brief Desc: 
                                    
                                
                                
                                    Floor Space: 
                                    
                                
                                
                                    Arrangeents: 
                                    
                                
                            
                             
                            
                                
                                    Floor Space Others Room: 
                                    
                                
                                
                                    Sanitary Convenience: 
                                    
                                
                                
                                    Storage Food: 
                                    
                                
                            
                             
                            
                                
                                    Carrying Nurse Home: 
                                    
                                
                                
                                    Maternity Patients: 
                                    
                                
                                
                                    No of Beds: 
                                    
                                
                            
                             
                            
                                
                                    Name-Age-Qual: 
                                    
                                
                                
                                    Place Nursing Staff: 
                                    
                                
                                
                                    Name-Age-Qual Resident: 
                                    
                                
                            
                             
                            
                                
                                    Nursing Home- Name-Age: 
                                    
                                
                                
                                    Un Reg Medical Practical: 
                                    
                                
                                
                                    Person Align: 
                                    
                                

                            
                             
                            
                                
                                    Feeds Charge: 
                                    
                                
                                
                                    Busi.Contected: 
                                    
                                
                                
                                    No of Date Exp of Certificate: 
                                    
                                
                            
                            
                        

                        

                        
                            
                                
                                    
                                        Annexure- A
                                        
                                    
                                
                                
                                    
                                        
                                    


                                
                            
                        

                        

                        


                        
                            
                                
                                    
                                        Annexure- C
                                        
                                    
                                
                                
                                    
                                        
                                    


                                
                            
                        

                        

                        

                        
                            
                                
                                    
                                        Annexure- D
                                        
                                    
                                
                                
                                    
                                        
                                    


                                
                            
                        


                        

                        

                        
                            
                                
                                    
                                        Annexure- E
                                        
                                    
                                
                                
                                    
                                        
                                    


                                
                            
                        

                        


                        

                        
                            
                                
                                    
                                        Annexure- F
                                        
                                    
                                
                                
                                    
                                        
                                    


                                
                            
                        

                        


                        

                        
                            
                                
                                    
                                        Annexure- G
                                        
                                    
                                
                                
                                    
                                        
                                    


                                
                            
                        

                        



                        

                        
                        
                            
                                
                                    
                                        List of Equipments
                                        
                                    
                                
                                
                                    
                                        
                                            Equipment for Major &amp; Minor OT
                                            
                                            
                                            
                                        
                                        
                                            Equipment for Labour Room
                                            
                                            
                                            
                                        
                                        
                                            Equipment for Sterilization Room
                                            
                                            
                                            
                                        
                                        
                                            Equipment for Endoscopy
                                            
                                            
                                            
                                        
                                        
                                            Equipment for ICU
                                            
                                            
                                            
                                        
                                        
                                            Equipment for NICU/PICU
                                            
                                            
                                            
                                        
                                        
                                            Equipment for Radiology
                                            
                                            
                                            
                                        
                                        
                                            Equipment for Casuality
                                            
                                            
                                            
                                        

                                    


                                
                            
                        
                        

                        
                    

                    
                        
                            Close
                        
                    

                
            
        


    


    
        
            
                
                    SL No.Request to AdminHospital NameHospital CodeApplicant NamePlaceMobile NumberStatusNo Records Found
                
            
        

    

    
        
            
                
                    
                        
                            
                                Hospital Name:
                                
                            
                            
                                Hospital Code:
                            
                        
                    

                    
                        
                            
                                
                                
                            
                        
                    

                    
                        
                            Close
                        
                    

                
            
        
        


    


    
    
    

        var strdata = &quot;&quot;;

        var phusename = $.dough(&quot;pname&quot;);
        var phosid = $.dough(&quot;phoscode&quot;);
        var prid = $.dough(&quot;Sid&quot;);


        var popupWindow = null;

        $(document).ready(function () {

            $('#updatereq').on('scroll touchmove mousewheel', function (event) {
                event.preventDefault();
            });

            //$('#ContentPlaceHolder1_grdview').dataTable({
            //    &quot;bLengthChange&quot;: false,
            //    &quot;aaSorting&quot;: [],
            //    &quot;bDestroy&quot;: true
            //});

            loaddata('');

        });


        function parent_disable() {
            if (popupWindow &amp;&amp; !popupWindow.closed)
                popupWindow.focus();
        }


        function isNumber(evt) {
            evt = (evt) ? evt : window.event;
            var charCode = (evt.which) ? evt.which : evt.keyCode;
            if (charCode > 31 &amp;&amp; (charCode &lt; 48 || charCode > 57)) {
                return false;
            }
            return true;
        }


        $('#btnclose').click(function () {
            $('#txtamt').val('');
            $(location).attr('href', 'Privatehoslogin.aspx');
        });

        $('#btnclosed').click(function () {
            $('#txtamt').val('');
            $(location).attr('href', 'Privatehoslogin.aspx');
        });





        function loaddata() {

            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/Getprivatehosdetails1&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'phosid':'&quot; + phosid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj.err == &quot;1&quot;) {
                        return;
                    }
                    if (obj != null &amp;&amp; obj != &quot;&quot;) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];
                            if (sdata.cnt > 0) {

                                $('#tblloadprivatehos').html('');

                                strdata = &quot;&lt;thead>&lt;tr>&lt;th>SL No.&lt;/th>&lt;th>&lt;/th>&lt;th style='display:none;'>Request to Admin&lt;/th>&lt;th>Hospital Name&lt;/th>&lt;th style='display:none;'>Hospital Code&lt;/th>&lt;th>Applicant Name&lt;/th>&lt;th>Place&lt;/th>&lt;th>Mobile Number&lt;/th>&lt;th>Status&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
                                var Sname = &quot;&quot;;
                                $.ajax({
                                    type: &quot;POST&quot;,
                                    url: &quot;WebService.asmx/Getprivatehosdetails&quot;,
                                    contentType: &quot;application/json; charset=utf-8&quot;,
                                    data: &quot;{'Sname':'&quot; + Sname + &quot;','phosid':'&quot; + phosid + &quot;'}&quot;,
                                    datatype: &quot;json&quot;,
                                    success: function (ResponseText) {
                                        var mstatuscode = ResponseText.d;
                                        var obj = $.parseJSON(mstatuscode);
                                        if (obj.err == &quot;1&quot;) {
                                            return;
                                        }
                                        if (obj != null &amp;&amp; obj != &quot;&quot;) {
                                            var x = 1;
                                            for (i = 0; i &lt; obj.length; i++) {
                                                var sdata = obj[i];

                                                var disp = sdata.RequestSend;
                                                var state = sdata.Status;
                                                if (state == &quot;&quot; || state == null) {
                                                    state = &quot;Request Send&quot;;
                                                }
                                                if (disp == &quot;false&quot; || disp == false) {
                                                    strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>' + x + '&lt;/td>&lt;td class=&quot;text-center&quot;>&lt;input type=&quot;button&quot; iid=&quot;' + sdata.Id + '&quot; hosname=&quot;' + sdata.Hospital_Name + '&quot; name=&quot;' + sdata.Application_Name + '&quot; curdate=&quot;' + sdata.Curdate + '&quot;  class=&quot;btn btn-primary&quot; onclick=clickme(this) value=&quot;View Details&quot;/>&lt;/td>&lt;td class=&quot;text-center&quot; style=&quot;display:none;&quot;>&lt;input type=&quot;button&quot; hosname=&quot;' + sdata.Hospital_Name + '&quot; value=&quot;Send&quot; class=&quot;btn btn-primary btn-sm&quot; onclick=&quot;sendrow(this);&quot; />&lt;/td>&lt;td>' + sdata.Hospital_Name + '&lt;/td>&lt;td class=&quot;text-center&quot; style=&quot;display:none;&quot;>' + sdata.Hospital_Code + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Application_Name + '&lt;/td>&lt;td>' + sdata.Place + '&lt;/td>&lt;td>' + sdata.ResTelno + '&lt;/td>&lt;td style=&quot;font-weight:Bold;color:DarkBlue;&quot;>' + state + '&lt;/td>&lt;/tr>';
                                                }
                                                else {
                                                    strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>' + x + '&lt;/td>&lt;td class=&quot;text-center&quot;>&lt;input type=&quot;button&quot; iid=&quot;' + sdata.Id + '&quot; hosname=&quot;' + sdata.Hospital_Name + '&quot; name=&quot;' + sdata.Application_Name + '&quot; curdate=&quot;' + sdata.Curdate + '&quot;  class=&quot;btn btn-primary&quot; onclick=clickme(this) value=&quot;View Details&quot;/>&lt;/td>&lt;td class=&quot;text-center&quot; style=&quot;display:none;&quot;>&lt;input type=&quot;button&quot; hosname=&quot;' + sdata.Hospital_Name + '&quot; value=&quot;Send&quot; class=&quot;btn btn-primary btn-sm&quot; onclick=&quot;sendrow(this);&quot; disabled=disabled />&lt;/td>&lt;td>' + sdata.Hospital_Name + '&lt;/td>&lt;td class=&quot;text-center&quot; style=&quot;display:none;&quot;>' + sdata.Hospital_Code + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Application_Name + '&lt;/td>&lt;td>' + sdata.Place + '&lt;/td>&lt;td>' + sdata.ResTelno + '&lt;/td>&lt;td style=&quot;font-weight:Bold;color:DarkBlue;&quot;>' + state + '&lt;/td>&lt;/tr>';
                                                }

                                                x++;
                                                strdata += '&lt;/tbody>';
                                                $('#tblloadprivatehos').html('');
                                                $('#tblloadprivatehos').append(strdata);
                                                $('#tblloadprivatehos').show();
                                                $('#tblloadprivatehos').dataTable({
                                                    &quot;bDestroy&quot;: true,
                                                    &quot;aaSorting&quot;: [],
                                                    &quot;bLengthChange&quot;: false
                                                    //&quot;sScrollX&quot;: &quot;110%&quot;
                                                });
                                            }
                                            $('#clickreg').hide();
                                        }
                                        else {
                                            strdata += '&lt;tr>&lt;td colspan=&quot;6&quot; align=&quot;center&quot;>&lt;lable>&lt;b>No Records Found&lt;/b>&lt;/td>&lt;/tr>';
                                            strdata += '&lt;/tbody>';
                                            $('#tblloadprivatehos').html('');
                                            $('#tblloadprivatehos').append(strdata);
                                            $('#tblloadprivatehos').show();
                                            $('#clickreg').show();
                                        }

                                    },
                                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                                        bootbox.alert(Error);
                                    }
                                });
                            }
                            else {
                                $('#updatereq').modal('show');
                            }
                        }
                    }
                }
            });

        }



        function clickme(obj) {

            var hospname = $(obj).attr('hosname');
            var name = $(obj).attr('name');
            var curdate = $(obj).attr('curdate');
            var hoscode = $(obj).attr('iid');

            //$('#idinvoice').text(hoscode);
            //$('#idgrnno').text(hospname);
            //$('#myModal').modal('show');

            $('#idgrnno1').text(hospname);
            $('#idinvoice1').text(name);
            $('#idinvoice2').text(curdate);

            $('#myModal1').modal('show');
            $('#itemdetails tr:gt(0)').each(function () {
                $('#itemdetails tr:gt(0)').remove();
            });

            //loaditems(hospname, hoscode);
            //loaditems(hospname);
            loadhospdata(hoscode);
            loadhospannex_a(hoscode);
            loadhospannex_c(hoscode);
            loadhospannex_d(hoscode);
            loadhospannex_e(hoscode);
            loadhospannex_f(hoscode);
            loadhospannex_g(hoscode);
            loadhospannex_equip_endo(hoscode);
            loadhospannex_equip_labour(hoscode);
            loadhospannex_equip_Room(hoscode);
            loadhospannex_equip_endos(hoscode);
            loadhospannex_equip_icu(hoscode);
            loadhospannex_equip_nicu(hoscode);
            loadhospannex_equip_Radio(hoscode);
            loadhospannex_equip_casual(hoscode);
        }

        function loadhospdata(hoscode) {
            var hospnameid = hoscode;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospital&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {
                        if (obj.length > 0) {
                            for (i = 0; i &lt; obj.length; i++) {
                                var sdata = obj[i];

                                $('#lbltext1').text(sdata.ResTelno);
                                $('#lbltext2').text(sdata.Residential_Add);
                                $('#lbltext3').text(sdata.Nationality);
                                $('#lbltext4').text(sdata.Suituation_of_Reg);
                                $('#lbltext5').text(sdata.Name_Other);
                                $('#lbltext6').text(sdata.Place);
                                $('#lbltext7').text(sdata.Brief_Desc);
                                $('#lbltext8').text(sdata.Floor_Space_BedRoom);
                                $('#lbltext9').text(sdata.Arragegements_Immuni);
                                $('#lbltext10').text(sdata.Floor_Spcae_OtherRooms);
                                $('#lbltext11').text(sdata.Sanitary_Convenience_Pat);
                                $('#lbltext12').text(sdata.Storage_Food);
                                $('#lbltext13').text(sdata.Carry_Nursing_Home);
                                $('#lbltext14').text(sdata.Maternity_Patients);
                                $('#lbltext15').text(sdata.No_Beds_OtherPat);
                                $('#lbltext16').text(sdata.Name_Age_Quali_Staff);
                                $('#lbltext17').text(sdata.Place_NursingStaff);
                                $('#lbltext18').text(sdata.Name_Age_Quali_Resident);
                                $('#lbltext19').text(sdata.NurHome_NameAgeQuali);
                                $('#lbltext20').text(sdata.UnReg_MedicalPrac);
                                $('#lbltext21').text(sdata.Person_align);
                                $('#lbltext22').text(sdata.Feeds_Charge);
                                $('#lbltext23').text(sdata.Busi_conducted);
                                $('#lbltext24').text(sdata.No_date_Exp_CertReg);
                                //$('#lbltext25').text(sdata.Sign_appli);
                            }
                        }

                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }


        function loadhospannex_a(hoscode) {
            $('#tblannex-a').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>Owner Name&lt;/th>&lt;th>Hosp.Premisies&lt;/th>&lt;th>Lease Name&lt;/th>&lt;th>Phone No&lt;/th>&lt;th>Name&lt;/th>&lt;th>Area&lt;/th>&lt;th>No of Bed&lt;/th>&lt;th>Duration&lt;/th>&lt;th>Present Status&lt;/th>&lt;th>Details of Rooms&lt;/th>&lt;th>Area&lt;/th>&lt;th>Specify Others&lt;/th>&lt;th>Doctor Name&lt;/th>&lt;th>Qualification&lt;/th>&lt;th>Age&lt;/th>&lt;th>Registration No&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_A&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Owner_Name + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Hos_Preimises + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Lease_Own_Name + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.PhoneNO + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.NameA + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.AreaA + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoofbedA + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Aprevious + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Apresent + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.DetailsroomsA + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.AreasqdtA + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.specifyothersA + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.ADocname + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.AQualification + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.AAge + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Astamp + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblannex-a&quot;).html('');
                        $('#tblannex-a').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_c(hoscode) {
            $('#tblannex-c').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>Doctor Name&lt;/th>&lt;th>Speciality&lt;/th>&lt;th>Qualification&lt;/th>&lt;th>Age&lt;/th>&lt;th>Registration No&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_C&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Doctor_Name + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Speciality + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Qualification + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Age + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.RegNo_MediCouncil + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblannex-c&quot;).html('');
                        $('#tblannex-c').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_d(hoscode) {
            $('#tblannex-d').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>Doctor Name&lt;/th>&lt;th>Speciality&lt;/th>&lt;th>Qualification&lt;/th>&lt;th>Age&lt;/th>&lt;th>Registration No&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_D&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Doctor_Name + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.DocSpl + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Qualification + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Age + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.RegNo_MedCoun + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblannex-d&quot;).html('');
                        $('#tblannex-d').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_e(hoscode) {
            $('#tblannex-e').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>Doctor Name&lt;/th>&lt;th>Speciality&lt;/th>&lt;th>Qualification&lt;/th>&lt;th>Age&lt;/th>&lt;th>Registration No&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_E&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Ward_Name + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Doctor_Name + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Qualification + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Age + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Reg_No + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblannex-e&quot;).html('');
                        $('#tblannex-e').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_f(hoscode) {
            $('#tblannex-f').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>Doctor Name&lt;/th>&lt;th>Qualification&lt;/th>&lt;th>Age&lt;/th>&lt;th>Registration No&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_F&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Name_Tech + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Qualification + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Age + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.RegNo + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblannex-f&quot;).html('');
                        $('#tblannex-f').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_g(hoscode) {
            $('#tblannex-g').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>Service Details&lt;/th>&lt;th>Chargers&lt;/th>&lt;th>Service Details1&lt;/th>&lt;th>Chargers1&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_G&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Service_details1 + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Chargers1 + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Service_details2 + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Chargers2 + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblannex-g&quot;).html('');
                        $('#tblannex-g').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_endo(hoscode) {
            $('#tblmajor').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>No OT Available&lt;/th>&lt;th>No of Quantity&lt;/th>&lt;th>No of Beds&lt;/th>&lt;th>No of Quantity&lt;/th>&lt;th>Boyles Machine Quantity&lt;/th>&lt;th>Operation Table Quantity&lt;/th>&lt;th>Laryngoscope Quantity&lt;/th>&lt;th>Endotracheal Tubes Quantity&lt;/th>&lt;th>Pulse Oxymeter Quantity&lt;/th>&lt;th>Electric Suction Machine with generator connection Quantity&lt;/th>&lt;th>Food Suction Machine  Quantity&lt;/th>&lt;th>Emergency tray Quantity&lt;/th>&lt;th>Electric autoclave with additional stand by Quantity&lt;/th>&lt;th>Fixed or mobile showless lamp Quantity&lt;/th>&lt;th>Electrocautery machine Quantity&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_major&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.NoOT_Available + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoOT_Qty + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoBeds_Available + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.NoBeds_Qty + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Boyles_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Operation_Table + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Laryngoscope + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Endotracheal_Tubes + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Pulse_oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Electric_Suction + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Food_Suction + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Emergency_tray + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Electric_autoclave + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Fixed_Mobile + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Electro_Machine + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblmajor&quot;).html('');
                        $('#tblmajor').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_labour(hoscode) {
            $('#tbllabour').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>	&lt;th>No of ICU&lt;/th>	&lt;th>No of ICU Quantity&lt;/th>	&lt;th>No of Beds&lt;/th>	&lt;th>No of Quantity&lt;/th>	&lt;th>Labour Table Quantity&lt;/th>	&lt;th>Central Oxygen System or oxygen cylinder Quantity&lt;/th>	&lt;th>Laryngoscope Quantity&lt;/th>	&lt;th>Endotracheal Tubes Quantity&lt;/th>	&lt;th>Pulse Oxymeter Quantity&lt;/th>	&lt;th>Electric Suction Machine with generator connection Quantity&lt;/th>&lt;th>Electric stem sterilizer&lt;/th>	&lt;th>Fixed or mobile showless lamp&lt;/th>	&lt;th>ECG Machine&lt;/th>	&lt;th>Infant Warmer&lt;/th>&lt;th>OT equipments for EMOC care&lt;/th>&lt;th>Foetouscope&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_labour&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.NoICU_Available + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoICU_Quanitity + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoBeds_Available + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.NoBeds_Quantity + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Labour_Table + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Central_Oxygen + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Laryngoscope + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Endotracheal_tube + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Pulse_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Elect_Suction + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Elect_stem + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Fixed_Mobile + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.ECG_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Infant_Warmer + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Ot_Eqpts + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.Foetouscope + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tbllabour&quot;).html('');
                        $('#tbllabour').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_Room(hoscode) {
            $('#tblroom').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>	&lt;th>Autoclave&lt;/th>	&lt;th>Stream Sterilizers&lt;/th>	&lt;th>Fumigation Machine&lt;/th>	&lt;th>ETO Sterilizer&lt;/th>	&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_room&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Autoclave + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Steam_sterilizer + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Fumigation_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.ETO_Sterilizer + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblroom&quot;).html('');
                        $('#tblroom').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_endos(hoscode) {
            $('#tblendo').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>	&lt;th>Operation Table&lt;/th>	&lt;th>Boyles Machine with four stand by cylinders &lt;/th>	&lt;th>Boyles Machine with four stand by cylinders &lt;/th>	&lt;th>Laryngoscoper&lt;/th> &lt;th>Endotracheal Tubes&lt;/th>&lt;th>Pulse Oxymeter&lt;/th>&lt;th>Electric Suction Machine with generator connection&lt;/th>&lt;th>Food Suction Machine &lt;/th>&lt;th>Emergency tray&lt;/th>	&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_endo&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Operation_Table + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Boyles_Machine1 + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Boyles_Machine2 + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Laryngoscope + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Endotracheal + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Pulse_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Elect_Suc + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Food_Suction + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Emergncy_tray + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblendo&quot;).html('');
                        $('#tblendo').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_icu(hoscode) {
            $('#tblicu').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>No.of ICU&lt;/th>	&lt;th>No.of ICU Quantity &lt;/th>	&lt;th>No.of Beds&lt;/th>	&lt;th>No.of Beds Quantity&lt;/th> &lt;th>Central oxygen system or oxygen cylinder&lt;/th>&lt;th>Suction Machine&lt;/th>&lt;th>Food Suction Machine &lt;/th>&lt;th>Bedside monitor of ECG, SPO2 NIBP with central monitor &lt;/th>&lt;th>Endotracheal Tubes (all size)&lt;/th>&lt;th>Pulse oxymeter &lt;/th>&lt;th>Ventilator&lt;/th>&lt;th>Defibrilator&lt;/th>&lt;th>Emergency tray&lt;/th>&lt;th>ECG Machine&lt;/th>	&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_icu&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.No_ICU + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.NoICU_Qty + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.No_Beds + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoBeds_Qty + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Central_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Suction_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Food_Suction + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Bedside_monitor + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Endotracheal + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Pulse_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Ventilator + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Defibrilator + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Emergency_Tray + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.ECG_Machine + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblicu&quot;).html('');
                        $('#tblicu').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_nicu(hoscode) {
            $('#tblnicu').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>&lt;th>No.of ICU&lt;/th>	&lt;th>No.of ICU Quantity &lt;/th>	&lt;th>No.of Beds&lt;/th>	&lt;th>No.of Beds Quantity&lt;/th> &lt;th>Central oxygen system or oxygen cylinder&lt;/th>&lt;th>Suction Machine&lt;/th>&lt;th>Foetal monitor &lt;/th>&lt;th>Neonatal Resuccitation Kit &lt;/th>&lt;th>Endotracheal Tubes (Pead)&lt;/th>&lt;th>Pulse oxymeter &lt;/th>&lt;th>Neonatal Ventilator&lt;/th>&lt;th>infant Warmer&lt;/th>&lt;th>Emergency tray/cart&lt;/th>	&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_nicu&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.NoICU_Available + '&lt;/td>&lt;td class=&quot;text-center&quot;>  ' + sdata.NoICU_Qty + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoBed_Available + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.NoBeds_Qty + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Central_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Suction_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Foetal_Monitor + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Neonatal_Re + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Endotracheal_Tubes + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Pulse_oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Neonatal_ven + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Infant_War + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Emergeycy_Tray + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblnicu&quot;).html('');
                        $('#tblnicu').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_Radio(hoscode) {
            $('#tblradio').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>	&lt;th>Reagents&lt;/th>&lt;th>Developing reagents&lt;/th>	&lt;th>X-Ray films&lt;/th>	&lt;th>X-Ray Machine&lt;/th>&lt;th>Portable X-Ray Machine&lt;/th>	&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_radio&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Reagents + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Develping_reagents + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Xray_films + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Xray_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Portable_Xray_Mac + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblradio&quot;).html('');
                        $('#tblradio').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }

        function loadhospannex_equip_casual(hoscode) {
            $('#tblcasual').html();
            var hospnameid = hoscode;
            var strdata = &quot;&lt;thead>&lt;tr>	&lt;th>Central oxygen system or oxygen cylinder&lt;/th>	&lt;th>Suction Machine &lt;/th>	&lt;th>Food Suction Machine &lt;/th>	&lt;th>Bedside monitor of ECG, SPO2 NIBP with central monitor&lt;/th>&lt;th>Pulse Oxymeter&lt;/th>&lt;th>Ventilator&lt;/th>&lt;th>defibrilator&lt;/th>&lt;th>Emergency tray&lt;/th>&lt;th>ECG Machine&lt;/th>&lt;th>Emergency tray&lt;/th>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/getmstrdetailsPhospitalannex_Equip_casual&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospnameid':'&quot; + hospnameid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];

                            strdata += '&lt;tr>&lt;td class=&quot;text-center&quot;>  ' + sdata.Central_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Suction_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;> ' + sdata.Food_Suction + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Bedside_Monitor + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Pulse_Oxy + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Ventilator + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Defibrilator + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Emergency_Tray1 + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.ECG_Machine + '&lt;/td>&lt;td class=&quot;text-center&quot;>' + sdata.Emergency_Tray2 + '&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#tblcasual&quot;).html('');
                        $('#tblcasual').append(strdata);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }



        function sendrow(obj) {

            bootbox.dialog({
                message: &quot;Are you sure! you want to Send?&quot;,
                buttons: {
                    success: {
                        label: &quot;No&quot;,
                        className: &quot;btn btn-default&quot;,
                        callback: function () {
                        }
                    },
                    main: {
                        label: &quot;Yes&quot;,
                        className: &quot;btn btn-primary&quot;,
                        callback: function () {
                            var honame = $(obj).attr('hosname');
                            update_send(honame);
                        }
                    }
                }
            });

        }

        function update_send(obj) {
            var hospname = obj;
            var Status = &quot;Request Send&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/Requestsendtoadminforprivate&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'hospname':'&quot; + hospname + &quot;','prid':'&quot; + prid + &quot;','Status':'&quot; + Status + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj != null) {
                        if (obj.length > 0) {
                            for (i = 0; i &lt; obj.length; i++) {
                                var sdata = obj[i];
                                if (sdata.result == &quot;1&quot; || sdata.result == 1) {
                                    bootbox.alert(&quot;* Request Send Successfully !&quot;, function () {
                                        $(location).attr('href', 'Privatehosregistrationdash.aspx');
                                    });
                                }
                                else {
                                    bootbox.alert(&quot;* Already Sended !&quot;);
                                }
                            }
                        }

                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
        }




        //function loaditems(obj, obj2) {
        //    var tr01key = obj;
        //    var tr02key = obj2;
        //    strdata = &quot;&lt;thead>&lt;tr>&lt;th>Building Sanction&lt;/th>&lt;th>Building Approval&lt;/th>&lt;th>Lease Agreement&lt;/th>&lt;th>Sep Water Connection&lt;/th>&lt;th>Layout Plan&lt;/th>&lt;th>Qualification Certificate&lt;/th>&lt;th>Nursing Staff&lt;/th>&lt;th>NOC&lt;/th>&lt;th>Sufficient Capacity&lt;/th>&lt;th>Required Renewal&lt;/th>&lt;th>Require Blood&lt;/th>&lt;th>Required Ambulance&lt;/th>&lt;th>Latest Swab&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
        //    $.ajax({
        //        type: &quot;POST&quot;,
        //        url: &quot;WebService.asmx/Getdocumemtsforprivatehospitalproperties&quot;,
        //        contentType: &quot;application/json; charset=utf-8&quot;,
        //        data: &quot;{'tr01key':'&quot; + tr01key + &quot;','tr02key':'&quot; + tr02key + &quot;'}&quot;,
        //        datatype: &quot;json&quot;,
        //        success: function (ResponseText) {
        //            var mstatuscode = ResponseText.d;
        //            var obj = $.parseJSON(mstatuscode);
        //            if (obj.err == &quot;1&quot;) {
        //                return;
        //            } if (obj != null) {

        //                for (i = 0; i &lt; obj.length; i++) {
        //                    var sdata = obj[i];
        //                    //grnno = sdata.Rno; invoice = sdata.DepName;
        //                    var build = sdata.ContentType;
        //                    var build2 = sdata.ContentType2;
        //                    var build3 = sdata.ContentType3;
        //                    var build4 = sdata.ContentType4;
        //                    var build5 = sdata.ContentType5;
        //                    var build6 = sdata.ContentType6;
        //                    var build7 = sdata.ContentType7;
        //                    var build8 = sdata.ContentType8;
        //                    var build9 = sdata.ContentType9;
        //                    var build10 = sdata.ContentType10;
        //                    var build11 = sdata.ContentType11;
        //                    var build12 = sdata.ContentType12;
        //                    var build13 = sdata.ContentType13;
        //                    if (build == &quot;&quot; || build == undefined || build2 == &quot;&quot; || build2 == undefined || build3 == &quot;&quot; || build3 == undefined || build4 == &quot;&quot; || build4 == undefined || build5 == &quot;&quot; || build5 == undefined || build6 == &quot;&quot; || build6 == undefined || build7 == &quot;&quot; || build7 == undefined || build8 == &quot;&quot; || build8 == undefined || build9 == &quot;&quot; || build9 == undefined || build10 == &quot;&quot; || build10 == undefined || build11 == &quot;&quot; || build11 == undefined || build12 == &quot;&quot; || build12 == undefined || build13 == &quot;&quot; || build13 == undefined) {
        //                        bootbox.alert(&quot;* No Records Found!&quot;);
        //                    }
        //                    else {

        //                    }
        //                    strdata += '&lt;tr>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build2 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build3 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build4 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build5 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build6 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build7 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build8 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build9 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build10 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build11 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build12 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build13 + '&quot; download>Download&lt;/a>&lt;/td>&lt;/tr>'
        //                }
        //                strdata += '&lt;/tbody>';

        //                $(&quot;#itemdetails&quot;).html('');
        //                $('#itemdetails').append(strdata);

        //            }

        //        },
        //        error: function (XMLHttpRequest, textStatus, errorThrown) {
        //            bootbox.alert(Error);
        //        }
        //    });

        //}


        function loaditems(obj) {
            var tr01key = obj;
            strdata = &quot;&lt;thead>&lt;tr>&lt;th>Building Sanction&lt;/th>&lt;th>Building Approval&lt;/th>&lt;th>Lease Agreement&lt;/th>&lt;th>Sep Water Connection&lt;/th>&lt;th>Layout Plan&lt;/th>&lt;th>Qualification Certificate&lt;/th>&lt;th>Nursing Staff&lt;/th>&lt;th>NOC&lt;/th>&lt;th>Sufficient Capacity&lt;/th>&lt;th>Required Renewal&lt;/th>&lt;th>Require Blood&lt;/th>&lt;th>Required Ambulance&lt;/th>&lt;th>Latest Swab&lt;/th>&lt;/tr>&lt;/thead>&lt;tbody>&quot;;
            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/Getdocumemtsforprivatehospitalproperties&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'tr01key':'&quot; + tr01key + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    var obj = $.parseJSON(mstatuscode);
                    if (obj.err == &quot;1&quot;) {
                        return;
                    } if (obj != null) {

                        for (i = 0; i &lt; obj.length; i++) {
                            var sdata = obj[i];
                            //grnno = sdata.Rno; invoice = sdata.DepName;
                            var build = sdata.ContentType;
                            var build2 = sdata.ContentType2;
                            var build3 = sdata.ContentType3;
                            var build4 = sdata.ContentType4;
                            var build5 = sdata.ContentType5;
                            var build6 = sdata.ContentType6;
                            var build7 = sdata.ContentType7;
                            var build8 = sdata.ContentType8;
                            var build9 = sdata.ContentType9;
                            var build10 = sdata.ContentType10;
                            var build11 = sdata.ContentType11;
                            var build12 = sdata.ContentType12;
                            var build13 = sdata.ContentType13;
                            if (build == &quot;&quot; || build == undefined || build2 == &quot;&quot; || build2 == undefined || build3 == &quot;&quot; || build3 == undefined || build4 == &quot;&quot; || build4 == undefined || build5 == &quot;&quot; || build5 == undefined || build6 == &quot;&quot; || build6 == undefined || build7 == &quot;&quot; || build7 == undefined || build8 == &quot;&quot; || build8 == undefined || build9 == &quot;&quot; || build9 == undefined || build10 == &quot;&quot; || build10 == undefined || build11 == &quot;&quot; || build11 == undefined || build12 == &quot;&quot; || build12 == undefined || build13 == &quot;&quot; || build13 == undefined) {
                                bootbox.alert(&quot;* No Records Found!&quot;);
                            }
                            else {

                            }
                            strdata += '&lt;tr>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build2 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build3 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build4 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build5 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build6 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build7 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build8 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build9 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build10 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build11 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build12 + '&quot; download>Download&lt;/a>&lt;/td>&lt;td  class=&quot;text-center&quot;>&lt;a  href=&quot;' + build13 + '&quot; download>Download&lt;/a>&lt;/td>&lt;/tr>'
                        }
                        strdata += '&lt;/tbody>';

                        $(&quot;#itemdetails&quot;).html('');
                        $('#itemdetails').append(strdata);

                    }

                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });

        }



        //$('#btnupdate').click(function () {

        //    var user = $('#txtamt').val();


        //    var pusername = phusename;
        //    var hosname = phosid;
        //    var phid = prid;



        //    if (user == &quot;&quot;) {
        //        bootbox.alert(&quot;* Please Enter All Mandatory Details!&quot;);
        //        $('#txtamt').focus();
        //    }

        //    else {
        //        //updatestatus(user, pusername, hosname, phid);
        //    }
        //});


        $(&quot;#btnupdate&quot;).click(function () {
            var user = $('#txtamt').val();


            var pusername = phusename;
            var hosname = phosid;
            var phid = prid;

            if (user == &quot;&quot;) {
                bootbox.alert(&quot;* Please Enter All Mandatory Details!&quot;);
                $('#txtamt').focus();
            }
            else {
                bootbox.dialog({
                    message: &quot;Are you sure! you want to pay?&quot;,
                    buttons: {
                        success: {
                            label: &quot;No&quot;,
                            className: &quot;btn btn-default&quot;,
                            callback: function () {
                            }
                        },
                        main: {
                            label: &quot;Yes&quot;,
                            className: &quot;btn btn-primary&quot;,
                            callback: function () {
                                updatestatus(user, pusername, hosname, phid);
                            }
                        }
                    }
                });
            }
        });



        function updatestatus(user, pusername, hosname, phid) {
            var uname = user;


            $.dough(&quot;PhosID&quot;, phid);
            $.dough(&quot;PhosUSER&quot;, user);
            $.dough(&quot;PhosUSERNAME&quot;, pusername);
            $.dough(&quot;PhosHOSNAME&quot;, hosname);


            if (uname != &quot;&quot;) {
                $.ajax({
                    type: &quot;POST&quot;,
                    url: &quot;WebService.asmx/updatepaymentinfoprivate&quot;,
                    contentType: &quot;application/json; charset=utf-8&quot;,
                    data: &quot;{'uname':'&quot; + uname + &quot;','pusername':'&quot; + pusername + &quot;','hosname':'&quot; + hosname + &quot;','phid':'&quot; + phid + &quot;'}&quot;,
                    datatype: &quot;json&quot;,
                    success: function (ResponseText) {
                        var mstatuscode = ResponseText.d;
                        var obj = $.parseJSON(mstatuscode);
                        if (obj != null) {
                            if (obj.length > 0) {
                                for (i = 0; i &lt; obj.length; i++) {
                                    var sdata = obj[i];

                                    if (sdata.result == &quot;1&quot;) {
                                        //bootbox.alert(&quot;* Payment Paid successfully!&quot;, function () {
                                        //    $(location).attr('href', 'Privatehosregistrationdash.aspx');
                                        //});
                                        cardpayment_signup(user, pusername, hosname, phid);
                                    }
                                    else if (sdata.result == &quot;2&quot;) {
                                        bootbox.alert(&quot;* This Payment Already Paid&quot;, function () {
                                            setTimeout(function () {
                                                $('#txtamt').focus();
                                            }, 100);
                                        });
                                    }
                                }

                            }
                        }

                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        bootbox.alert(&quot;Error..&quot;);
                    }
                });
            }
            else {
                bootbox.alert(&quot;* Please Give Proper Mandatory Fields&quot;, function () {

                    $('#txtpass').val('');
                    $('#txtpass1').val('');
                    $('#lblerror').text('');
                });
            }
        }


        function cardpayment_signup(user, pusername, hosname, phid) {

            $.ajax({
                type: &quot;POST&quot;,
                url: &quot;WebService.asmx/WebprivateentrysignupcardPayment&quot;,
                contentType: &quot;application/json; charset=utf-8&quot;,
                data: &quot;{'val':'&quot; + phid + &quot;'}&quot;,
                datatype: &quot;json&quot;,
                success: function (ResponseText) {
                    var mstatuscode = ResponseText.d;
                    window.open(mstatuscode, '_blank');
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    bootbox.alert(Error);
                }
            });
            $(location).attr('href', 'Privatehosregistrationdash.aspx');

        }


    



                        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;connector&quot;)/div[5]</value>
   </webElementProperties>
</WebElementEntity>
