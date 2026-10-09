function checkcoursecode(){
    var coursecode=document.getElementById("coursecode").value;
    if(coursecode===""){
      document.getElementById("v1").innerHTML="**please select program!**";
      document.getElementById("coursecode").focus();
       return false;
   }else{
       document.getElementById("v1").innerHTML="";
   }
    return true;
}

function checkuserfname(){
    var userfname=document.getElementById("userfname").value;
    if(userfname===""){
      document.getElementById("v2").innerHTML="**please enter the text!**";
      focus("userfname");
      return false;
//      document.getElementById("userfname").focus();
   }else if(userfname.length<3){
      document.getElementById("v2").innerHTML="**please enter more then 3 character!**"; 
      document.getElementById("userfname").focus();
      return false;
   }else{
       document.getElementById("v2").innerHTML="";
        return true;
   }
}

function checkuserlname(){
     var userlname=document.getElementById("userlname").value;
   if(userlname===""){
      document.getElementById("v3").innerHTML="**please enter the text!**";
      document.getElementById("userlname").focus();
      return false;
   }else if(userlname.length<3){
      document.getElementById("v3").innerHTML="**please enter more then 3 character!**";
      document.getElementById("userlname").focus();
      return false;
   }else{
       document.getElementById("v3").innerHTML="";
        return true;
   }
}
function checkdob(){
         var dob=document.getElementById("dob").value;
         
   if(dob===""){
      document.getElementById("v4").innerHTML="**please enter the text!**";
      document.getElementById("dob").focus();
      return false;
   }else{
       document.getElementById("v4").innerHTML="";
        return true;
   }
}

function checkgender(){
   var gender=document.getElementById("gender").value;
   if(gender===""){
      document.getElementById("v5").innerHTML="**please enter the text!**";
      document.getElementById("gender").focus();
      return false;
   }else{
       document.getElementById("v5").innerHTML="";
        return true;
   }
}

function checkaddress(){
   var address=document.getElementById("address").value;
   if(address===""){
      document.getElementById("v6").innerHTML="**please enter the text!**";
      document.getElementById("address").focus();
      return false;
   }else{
       document.getElementById("v6").innerHTML="";
        return true;
   }
}

function checkpincode(){
        var pincode=document.getElementById("pincode").value;
   if(pincode===""){
      document.getElementById("v7").innerHTML="**please enter the text!**";
      document.getElementById("pincode").focus();
      return false;
   }else  if(pincode.length!==6){
       document.getElementById("v7").innerHTML="**please enter valid pincode!**";
        return false;
   }else{
       document.getElementById("v7").innerHTML="";
        return true;
   }
}

function checkmobilenumber(){
    var mobilenumber=document.getElementById("mobilenumber").value;
   if(mobilenumber===""){
      document.getElementById("v8").innerHTML="**please enter the text!**";
      document.getElementById("mobilenumber").focus();
      return false;
   }else if(mobilenumber.startsWith(0)){
       document.getElementById("v8").innerHTML="**mobilenumber should not start with 0!**";
   }else  if(mobilenumber.length!==10){
       document.getElementById("v8").innerHTML="**please enter valid mobilenumber!**";
        return false;
   }else{
       document.getElementById("v8").innerHTML="";
        return true;
   }
}

function checkuserid(){
     var userid=document.getElementById("userid").value;
     var atpos=userid.indexOf("@");
     var dotpos=userid.lastIndexOf(".");
     var count=0;
    for(i=1;i<=userid.length;i++){
        if(userid.charAt(i)==="@"){
            count++;
        }
    }
   if(userid===""){
      document.getElementById("v9").innerHTML="**please enter the text!**";
      return false;
   }else if(userid.startsWith("@") || userid.endsWith(".")){
       document.getElementById("v9").innerHTML="**email should not start with @ or ends with . !**";
        return false;
   }else if(count===2){
       document.getElementById("v9").innerHTML="**emailid should not  contain more then 1 @ !**";
        return false;
   }else if(dotpos < atpos+4){
       document.getElementById("v9").innerHTML="**Length of (.) should be greater then 2 from @ !**";
        return false;
   }else{
     document.getElementById("v9").innerHTML=""; 
        return true;
   }
}

function checkuserpassword(){
     var userpassword=document.getElementById("userpassword").value;
   if(userpassword===""){
         document.getElementById("v10").innerHTML="**please enter the text!**";
        document.getElementById("userpassword").focus();
         return false;
   }else{
   document.getElementById("v10").innerHTML="";
    return true;
   }
}

function checkconuserpassword(){
   var conuserpassword=document.getElementById("conuserpassword").value;
   var userpassword=document.getElementById("userpassword").value;
     if(conuserpassword===""){
    document.getElementById("v11").innerHTML="**please enter the text!**";
    document.getElementById("conuserpassword").focus();
    return false;
    }else if(conuserpassword!==userpassword){
       document.getElementById("v11").innerHTML="**password you enter does not match!**";
   }else{
     document.getElementById("v11").innerHTML="";
      return true;
     }
}