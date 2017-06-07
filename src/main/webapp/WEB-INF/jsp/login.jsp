<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html lang="en">
<head>

  <meta charset="utf-8">
  <title>All-Jobs</title>
  <meta name="description" content="Website to help People">
  <meta name="author" content="Alli Pierre Yotti">


  <meta name="viewport" content="width=device-width, initial-scale=1">


  <link href="//fonts.googleapis.com/css?family=Raleway:400,300,600" rel="stylesheet" type="text/css">


  <link rel="stylesheet" href="/static/css/normalize.css">
  <link rel="stylesheet" href="/static/css/skeleton.css">
  <link rel="stylesheet" href="/static/css/style.css">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css" rel="stylesheet">
   <script type="json/javascript"  src="/static/js/file.js"></script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
   <script src="/static/js/site.js"></script>


<style>

footer {
    margin-top: 0rem !important;
}

.ner {
    max-width: 800px !important;
    padding-top: 150px !important;
}

.sern {
	background:
		url(https://cdn.lynda.com/static/images/signin-background.jpg) center
		center no-repeat fixed;
	background-size: cover;
}










.crt a {
    color: rgb(30, 174, 219);
    text-decoration: none;
    font-size: 2rem;
}

.hrt{
color: rgb(255, 255, 255);
}

.lab{
color: rgb(255, 255, 255);
}
</style>

 
  <link rel="icon" type="image/png" href="images/favicon.png">

</head>
<body>
<%@ include file = "header.jsp" %>
    
  
<div class="sern">
    <div class="container ner">
  <form method="POST" action="${contextPath}/login" class="form-signin">
    <h2 class="form-heading hrt">Log in</h2>
    <div class="form-group ${error != null ? 'has-error' : ''}">
  <div class="row">
    <div class="six columns">
      <label class="lab" for="exampleEmailInput">Email</label>
      <span>${message}</span> <input class="u-full-width" type="email" placeholder="test@mailbox.com" id="exampleEmailInput">
    </div>
  </div>

  <div class="row">
    <div class="six columns">
      <label class="lab" for="exampleEmailInput">Password</label>
      <input class="u-full-width" type="email" placeholder="test@mailbox.com" id="exampleEmailInput"> <span>${error}</span> <input
					type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </div>
  </div>
  <input class="button-primary" type="button" value="Log In">
  <h4 class="text-center crt">
					<a href="${contextPath}/registration">Create an account</a>
	</h4>
  </div>
</form>


      </div>
        </div>



</body>


  <%@ include file = "footer.jsp" %>





<script>
$(function(){
$("#header").load("header.html");
});
document.addEventListener("DOMContentLoaded", function(){
	Typed.new(".price", {
		strings: ["GHC 500", "<strong>GHC 299</strong>"],
		typeSpeed: 1,
		loop: true
	});
});

$( "#industryInput" ).change(function() {  $( "#companyIndustry").val($(this).val()); });
$( "#countryInput" ).change(function() {  $( "#companyLocation").val($(this).val()); });
$( "#sizeInput" ).change(function() {  $( "#companySize").val($(this).val()); });

</script>
 <script type="text/javascript"  src="/static/js/file.js"></script>
 <script type="text/javascript"  src="/static/js/typed.js"></script>
 </html>
