<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<div id="pnCenterDisplay" style="width:692px;float:left">
	<textarea name ="ed" id ="ed" rows="10" class="ckeditor" cols="30">
		</textarea>
		<br/>
		
		
		<br />
	       <button id = "save1564" name = "save1564" onclick = "myFunction()">Save</button>
		
		<script>
	           CKEDITOR.replace( 'ed' );
	         
	           var text = '${text}';
	           
	           var editor = CKEDITOR.instances['ed'];
	           
	            
	             editor.setData( text );  
	       </script>
	       
	       <script type="text/javascript">
	       	function myFunction() {
	       		var editor = CKEDITOR.instances['ed'];
	       		
		         var noidung = editor.getData();
		         $.ajax({
		        	    type : "POST",
		        	    url : "/upload",
		        	    data : {
		        	        noidung:noidung
		        	    }
		        	   
		        	}); 
		         
		         
		        
		        
		        
			}
	       </script>
	       
	       </div>
	       
	   
</body>
</html>