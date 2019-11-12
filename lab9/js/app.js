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

        for(var i in localStorage){
            $('.list-group').append("<li class=\"list-group-item\" >" +localStorage.getItem(i)+"</li>")
        }
    });
});

var submit = document.querySelector("#submit");
var input = submit.addEventListener("click", function (event) {
    event.preventDefault()
    let studentId = document.getElementById("id").value;
    let name = document.getElementById("name").value;

    let student = {"studentId": studentId, "firstName": name};

    if (student.studentId !== "" && student.firstName !== "") {
        var item = student.studentId + " - " + student.firstName;
    }

    localStorage.setItem(student.studentId, item)

    $('.list-group').append("<li class=\"list-group-item\" >" + item + "</li>");

});