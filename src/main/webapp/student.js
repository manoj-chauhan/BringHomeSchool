var request; 
function createRequest(){
    try{
        request = new XMLHttpRequest();
        console.log("Request Created");
    }catch(trymicrosoft){
        console.log("Couldn't create async request.");
    }
}

function sendRequest(){
    createRequest();
    if(request != null){
        console.log("Sending request.");
        var url = "school/students"
        request.open("GET", url, true);
        request.onreadystatechange = callback;
        request.send(null);
    }else{
        console.log("Cannot send request.");
    }
}

function callback(){
    if(request.readyState == 4){
        if(request.status == 200){
            console.log("Response: "+request.responseText); 
            var responseJson = JSON.parse(request.responseText.toString());
            if(responseJson != null){
                var studentList = responseJson.studentList;
                console.log("No. of students: "+studentList.length);
                if(studentList != null && studentList.length > 0){
                    var body = document.getElementsByTagName("body")[0];
                    for(var i=0 ; i < studentList.length ; i++){
                        var responseNode = document.createTextNode(studentList[i].name);
                        body.appendChild(responseNode);
                        var linebreak = document.createElement("br");
                        body.appendChild(linebreak);
                    }
                }
            }
        }else{
            console.log("Something went wrong in receiving response.");
        }
    }
}


