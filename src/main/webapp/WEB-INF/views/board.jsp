<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 7 ]><html class="ie ie7" lang="en"><![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"><![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"><!--<![endif]-->
<head>

<!-- Basic Page Needs
================================================== -->
<meta charset="utf-8">
<title> - Free Theme s& Templates</title>

<!-- Mobile Specific
================================================== -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS
================================================== -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/boxed.css" id="layout">
<link rel="stylesheet" type="text/css" href="css/colors/green.css" id="colors">

<!-- Java Script
================================================== -->
<script src="js/jquery.min.js"></script>
<script src="js/custom.js"></script>
<script src="js/selectnav.js"></script>
<script src="js/flexslider.js"></script>
<script src="js/twitter.js"></script>
<script src="js/tooltip.js"></script>
<script src="js/effects.js"></script>
<script src="js/fancybox.js"></script>
<script src="js/carousel.js"></script>
<script src="js/isotope.js"></script>

<!-- Styles Switcher
================================================== -->
<link rel="stylesheet" type="text/css" href="css/switcher.css">
<script src="js/switcher.js"></script>

</head>
<body>

<!-- Wrapper Start -->
<div id="wrapper">


<!-- Header
================================================== -->

<!-- 960 Container -->
<div class="container ie-dropdown-fix">
	<!-- Header -->
		<%@include file="./head.jsp" %>
	<!-- Header / End -->
	
</div>
<!-- 960 Container / End -->


<!-- Content
================================================== -->
<div class="container">

	<div class="sixteen columns">
	
		<!-- Page Title -->
		<div id="page-title">
			<h2>班级留言</h2>
			<div id="bolded-line"></div>
		</div>
		<!-- Page Title / End -->

	</div>
</div>

<div class="container">
	
	<div class="comments-sec">
		
		<ol class="commentlist">
			<li>
				<div class="comments">
					<div class="avatar"><img  style="width: 50px"  src="images/about-01.png" alt="" width="50" height="50" border="0"> </div>
					<div class="comment-des">
					<div class="comment-by"><strong>John Doe</strong><span class="reply"><span style="color:#aaa">/ </span><a href="#">Reply</a></span> <span class="date">August 10, 2012</span></div>
						<p>Maecenas dignissim euismod nunc, in commodo est luctus eget. Proin in nunc laoreet justo volutpat blandit enim. Sem felis, ullamcorper vel aliquam non, varius eget justo. Duis quis nunc tellus. Mauris a felis arcu, vitae sollicitudin mauris. Aliquam quis tellus vel massa mattis ornare et eu felis. </p>
					</div>
				</div>
						 
				<ol class="childlist">
					<li>
					<div class="comments">
										<div class="avatar"><img  style="width: 50px"  src="images/about-01.png" alt="" border="0"> </div>
						<div class="comment-des">
						<div class="comment-by"><strong>Admin</strong><span class="reply"><span style="color:#aaa">/ </span><a href="#">Reply</a></span> <span class="date">August 12, 2012</span></div>
						<p>Dignissim euismod nunc, in commodo est luctus eget. Proin in nunc laoreet justo volutpat blandit enim. Sem felis, ullamcorper vel aliquam non, varius eget justo. Duis quis nunc tellus. Mauris a felis arcu, vitae sollicitudin mauris. Aliquam quis tellus vel massa mattis.</p>
						</div>
					</div>
					</li>
				</ol>		
			</li>
						
			<li>
				<div class="comments">
					<div class="avatar"><img  style="width: 50px"  src="images/about-01.png" alt="" border="0"> </div>
					<div class="comment-des">
					<div class="comment-by"><strong>Kathy Brown</strong><span class="reply"><span style="color:#aaa">/ </span><a href="#">Reply</a></span><span class="date">August 12, 2012</span></div>
						<p>Morbi velit eros, sagittis in facilisis non, rhoncus et erat. Nam posuere tristique sem, eu ultricies tortor imperdiet vitae. Curabitur lacinia neque non metus</p>
					</div>
				</div>
			</li>
						
			<li>
				<div class="comments">
					<div class="avatar"><img style="width: 50px" src="images/about-01.png" alt="" border="0"> </div>
					<div class="comment-des">
					<div class="comment-by"><strong>John Doe</strong><span class="reply"><span style="color:#aaa">/ </span><a href="#">Reply</a></span><span class="date">August 12, 2012</span></div>
						<p>Commodo est luctus eget. Proin in nunc laoreet justo volutpat blandit enim. Sem felis, ullamcorper vel aliquam non, varius eget justo. Duis quis nunc tellus. Mauris a felis arcu, vitae sollicitudin mauris.</p>
					</div>
				 </div>
			</li>
		 </ol>
					 
	</div>
	<div class="clear"></div>
	
	<div class="headline no-margin"><h4>留言</h4></div>
	<div class="form-spacer"></div>
	<div id="contact-form">
			<form method="post">
				<div class="field">
					<label>留言内容: <span>*</span></label>
					<textarea class="text textarea"></textarea>
				</div>
				
				<div class="field">
					<input type="button" id="send" value="留言">
				</div>
				
			</form>
		</div>
	<!-- End Portfolio Content -->
		
</div>


</div>
<!-- Wrapper / End -->
	<%@include file="./foot.jsp" %>


</body>
</html>