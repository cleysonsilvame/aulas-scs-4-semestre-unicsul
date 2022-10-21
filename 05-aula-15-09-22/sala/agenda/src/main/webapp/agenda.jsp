
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.Javabeans"%>
<%@ page import="java.util.ArrayList"%>

<%
ArrayList<Javabeans> contatos = (ArrayList<Javabeans>) request.getAttribute("contatos");

for (Javabeans contato : contatos) {
	out.println('olá');
}
%>
<!DOCTYPE html>
<html>

<head>
<meta charset='UTF-8'>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="icon" type="image/svg+xml" sizes="21x21"
	href="imagens/phone.svg">

<title>Agenda de contatos - JSP</title>
<script src='https://cdn.tailwindcss.com'></script>


<link
	href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap"
	rel="stylesheet">


<style type="text/tailwindcss">

@layer base {
  html {
    font-family: 'Roboto', system-ui, sans-serif;
  }
}

@layer components {
      .link-button {
        @apply inline-block mt-2 px-6 py-2.5
 				bg-transparent text-slate-50 
				font-medium text-xs leading-tight 
				uppercase rounded 
				hover:text-pink-900 hover:bg-pink-300 
				focus:bg-gray-100 focus:outline-none focus:ring-0 
				active:bg-gray-200 transition duration-150 ease-in-out;
      }
    }
  </style>

</head>

<body class='bg-pink-900 h-screen flex items-center '>
	<div
		class='container mx-auto bg-pink-800 px-6 py-8 rounded-md shadow-xl'>
		<div class='flex flex-col justify-center items-center'>
			<div class='flex gap-2 items-center'>

				<img alt="Calendário" src="imagens/calendar.svg" class="w-20" />
				<h1 class='text-white text-7xl font-medium tracking-tight'>
					Agenda de contatos - JSP</h1>
			</div>
			<a href="main" class="link-button"> Acessar </a>
		</div>
	</div>
</body>

</html>