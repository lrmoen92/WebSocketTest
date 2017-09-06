var stompClient = null;

function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
    document.getElementById('conversationDiv').style.visibility
        = connected ? 'visible' : 'hidden';
    document.getElementById('conversationDiv2').style.visibility
        = connected ? 'visible' : 'hidden';
    document.getElementById('response').innerHTML = '';
    document.getElementById('from').setAttribute("type", connected ? "hidden" : "text");
}

function connect() {
    var socket = new SockJS('/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/messages', function(messageOutput) {
            showMessageOutput(JSON.parse(messageOutput.body));
        });
    });

}

function disconnect() {
    if(stompClient != null) {
        stompClient.disconnect();
    }
    clearBox('from');
    setConnected(false);
    console.log("Disconnected");
}

function sendMessage() {
    var from = document.getElementById('from').value;
    var text = document.getElementById('text').value;
    stompClient.send("/app/chat", {},
        JSON.stringify({'from':from, 'text':text}));
    clearBox('text');
}

function clearBox(id){
    document.getElementById(id).value = "";
}

function showMessageOutput(messageOutput) {
    var response = document.getElementById('response');
    response.value += " (" + messageOutput.time + ") " + messageOutput.from + ": "
        + messageOutput.text;
    response.value += '\n';
    response.scrollTop = response.scrollHeight;
}

$(document).ready(function(){
    disconnect();

    $('#text').keydown(function(event){
        if (event.keyCode === 13){document.getElementById('sendMessage').click()}
    });

    $('#from').keydown(function(event){
        if (event.keyCode === 13){document.getElementById('connect').click()}
    });

    // $('#response').onChange(
    //     $('#response').scrollTop = $('#response').scrollHeight
    // )

});

