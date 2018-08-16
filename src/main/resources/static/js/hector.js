/*
 *  Metodos para 
 *              el xml
 */

$( document ).ready(function() {
     
	$("#xmlCambiar").click(function(){
		var dato = $(".formXML").val();
		xmlDoc = $.parseXML( dato );
		  xml = $( xmlDoc );
		  title = xml.find( "comida" );
		$(".form").html(title);
	});
});