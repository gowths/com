var selColor = "white";
var rowarray = ["row1","row2","row3","row4","row5"]
var scorearray =["score1","score2","score3","score4","score5"]
var i =0;
var j=0;
var tempArray = [ "#ff4d4d","#87cefa","#5cd65c","#000000","#ffff1a" ]
tempArray.shuffle();

function blueButton(){
document.getElementById("b1").style.backgroundColor = "87CEFA";
document.getElementById("b1").style.borderColor = "87CEFA";
} 
function setcolor(attcolor){
	var aid = document.getElementById("row_1");
	var alength = document.getElementById("row_1").length;
	var chid = document.getElementById("row_1").children;
	for(var i=0;i<length;i++){
		if(chid[i].getAttribute("set") == 0){
			child[i].style.backgroundColor = attcolor;
			break;
		}
	}

}

function setColor(bcolor){
	selColor = bcolor;

}
function changeColor(clicked_id,elem){
	//alert(clicked_id.target.parentNode.id);
	var pid = $(elem).parent().attr("id");
	//alert(pid);
	if(pid === rowarray[i]){
	document.getElementById(clicked_id).style.backgroundColor = selColor;
	document.getElementById(clicked_id).style.borderColor = selColor;
	}else{
		alert("Please fill in "+rowarray[i]+" :D");
	}
	
}

function checkGuess(){
	
//	var code = ["#ff4d4d", "#87CEFA", "#5cd65c","#000000"];

	
	var x = document.getElementById(rowarray[i]).querySelectorAll(".coinB");
	var y = document.getElementById(scorearray[j]).querySelectorAll(".cells");
	
	//alert(rgb2hex(x[0].style.backgroundColor));
	
	//alert(tempArray);
	
    if(rgb2hex((x[0].style.backgroundColor)) === tempArray[0]){
		y[0].style.backgroundColor = "purple";
	}if(((rgb2hex(x[0].style.backgroundColor)) === tempArray[1]) || ((rgb2hex(x[0].style.backgroundColor)) === tempArray[2]) || ((rgb2hex(x[0].style.backgroundColor)) === tempArray[3])){
				y[0].style.backgroundColor = "orange";
	}
	if((rgb2hex(x[1].style.backgroundColor)) === tempArray[1]){
		y[1].style.backgroundColor = "purple";
	}if(((rgb2hex(x[1].style.backgroundColor)) === tempArray[0]) || ((rgb2hex(x[1].style.backgroundColor)) === tempArray[2]) || ((rgb2hex(x[1].style.backgroundColor)) === tempArray[3])){
				y[1].style.backgroundColor = "orange";
	}
	if((rgb2hex(x[2].style.backgroundColor)) === tempArray[2]){
		y[2].style.backgroundColor = "purple";
	}if(((rgb2hex(x[2].style.backgroundColor)) === tempArray[0]) || ((rgb2hex(x[2].style.backgroundColor)) === tempArray[1]) || ((rgb2hex(x[2].style.backgroundColor)) === tempArray[3])){
				y[2].style.backgroundColor = "orange";
	}
	if((rgb2hex(x[3].style.backgroundColor)) === tempArray[3]){
		y[3].style.backgroundColor = "purple";
	}if(((rgb2hex(x[3].style.backgroundColor)) === tempArray[0]) || ((rgb2hex(x[3].style.backgroundColor)) === tempArray[1]) || ((rgb2hex(x[3].style.backgroundColor)) === tempArray[2])){
				y[3].style.backgroundColor = "orange";
	}
	
	if((y[0].style.backgroundColor === "purple") && (y[1].style.backgroundColor === "purple")&& (y[2].style.backgroundColor === "purple")&&(y[3].style.backgroundColor === "purple")){
		alert("You nailed it bro!:D")
	}else{
		if(i === 4){
			alert("Better luck next time dude!:D")
	alert("the code is"+tempArray);
		}
	}
	i++;
	j++;
	

//sleep(300);

	
}


Array.prototype.shuffle = function() {
    var input = this;
     
    for (var i = input.length-1; i >=0; i--) {
     
        var randomIndex = Math.floor(Math.random()*(i+1)); 
        var itemAtIndex = input[randomIndex]; 
         
        input[randomIndex] = input[i]; 
        input[i] = itemAtIndex;
    }
	
    return input;
}
 
//var tempArray = [ "#ff4d4d","#87CEFA","#5cd65c","#000000","#ffff1a" ]
//tempArray.shuffle();
 
// and the result is...
//alert(tempArray);




function rgb2hex(rgb) {
     if (  rgb.search("rgb") == -1 ) {
          return rgb;
     }
     else if ( rgb == 'rgba(0, 0, 0, 0)' ) {
         return 'transparent';
     }
     else {
          rgb = rgb.match(/^rgba?\((\d+),\s*(\d+),\s*(\d+)(?:,\s*(\d+))?\)$/);
          function hex(x) {
               return ("0" + parseInt(x).toString(16)).slice(-2);
          }
          return "#" + hex(rgb[1]) + hex(rgb[2]) + hex(rgb[3]); 
     }
}