/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var windowSizeArray = [ "width=500,height=500"];

$(document).ready(function(){
    $("#mVenta").click(function(){
        alert("Estas Aqui");
        var url = $(this).attr('target');
        var windowName = "popUp";//$(this).attr("name");
        var windowSize = windowSizeArray[0];

        window.open(url, windowName, windowSize);
    });
});

function ventas() {
//    var windowName = "popUp";//$(this).attr("name");
//    var windowSize = windowSizeArray[0];
    var newWindow = window.open('#{ventaForm.xhtml}', '', windowSizeArray[0]);
    if (window.focus) {
        newWindow.focus();
    }
    //window.open("pages/ventaForm.xhtml", windowName, windowSize);
}