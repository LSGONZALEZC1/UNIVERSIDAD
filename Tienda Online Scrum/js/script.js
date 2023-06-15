function render(data){
    var html = "<div class='commentBox'><div class='leftPanelImg'><img src='https://via.placeholder.com/90x90'></div><div class='rightPanel'><span>"+data.name+"</span><p>"+data.body+"</p></div><div class='clear'></div></div>";
    $('#container').append(html);
}

$(document).ready(function(){

    var coment = [];

    if(!localStorage.comentData){
        localStorage.comentData = [];
    }else{
        coment = JSON.parse(localStorage.comentData);
    }
    
    for(var i=0; i<coment.length; i++){
        render(coment[i]);
    }

    $("#addComent").click(function(){
        var addObj = {
            "name": $("#name").val(),
            "body": $("#bodytext").val()
        };
        console.log(addObj);
        localStorage.comentData = JSON.stringify(coment);
        coment.push(addObj);
        render(addObj);
        $("#name").val('');
        $("#bodytext").val('');
    });
});