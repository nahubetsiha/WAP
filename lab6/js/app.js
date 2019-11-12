function getTime(){
    var tm = new Date();
    document.getElementById('time').innerHTML=tm;
}
setInterval(getTime, 1000);

let students = [{ "studentId": "000-98-0001", "firstName": "James" },
    { "studentId": "000-98-0002", "firstName": "Anna" },
    { "studentId": "000-98-0003", "firstName": "Jeffrey" }];


(function getStudent(){
    document.getElementById('list1').innerHTML = students[0].studentId + " - " + students[0].firstName;
    document.getElementById('list2').innerHTML = students[1].studentId + " - " + students[1].firstName;
    document.getElementById('list3').innerHTML = students[2].studentId + " - " + students[2].firstName;   
})();

function getData(){
    let firstName = document.getElementById("name").value;
    let id = document.getElementById("id").value;
    if(firstName !== "" && id !== ""){
        let li = document.createElement("li");
        let value = document.createTextNode(id + " - " + firstName);
        li.appendChild(value);
        li.setAttribute("class", "list-group-item");
        let ul = document.querySelector(".list-group");
        ul.appendChild(li);
    }
}
var submit = document.querySelector("#submit");
submit.addEventListener("click", getData);
