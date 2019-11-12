function getTime(){
    var t = new Date();
    $("#time").text(t);
}

setInterval(getTime, 1000);

$(document).ready(function(){
    $.getJSON("json/studentData.json", function(ob){
        $.each(ob, function(key, value){
            $(".list-group").append("<li class=\"list-group-item\" >" + value.studentId + " - " + value.firstName + "</li>");
        });
    });
});