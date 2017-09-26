var stompClient = null;

function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
    document.getElementById('conversationDiv').style.visibility
        = connected ? 'visible' : 'hidden';
    document.getElementById('conversationDiv2').style.visibility
        = connected ? 'visible' : 'hidden';
    document.getElementById('response').innerHTML = '';
    document.getElementById('suit').setAttribute("type", !connected ? "hidden" : "value");
    document.getElementById('value').setAttribute("type", !connected ? "hidden" : "value");
}

function connect() {
    var socket = new SockJS('/cards');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/cards', function(messageOutput) {
            showMessageOutput(JSON.parse(messageOutput.body));
        });
    });

}

function disconnect() {
    if(stompClient != null) {
        stompClient.disconnect();
    }
    clearBox('suit');
    setConnected(false);
    console.log("Disconnected");
}

function sendMessage() {
    var suit = document.getElementById('suit').value;
    var value = document.getElementById('value').value;
    var player = document.getElementById('name').value;
    stompClient.send("/app/cards", {},
        JSON.stringify({'player':player, 'suit':suit, 'value':value, 'isDrawn':true}));
    clearBox('value');
    clearBox('suit');
}

function clearBox(id){
    document.getElementById(id).value = "";
}

function showMessageOutput(messageOutput) {
    var response = document.getElementById('response');
    response.value += messageOutput.player + ":(" + messageOutput.time + ") " + messageOutput.value + " of "
        + messageOutput.suit;
    response.value += '\n';
    response.scrollTop = response.scrollHeight;
}

$(document).ready(function(){
    disconnect();

    $('#value').keydown(function(event){
        if (event.keyCode === 13){document.getElementById('sendMessage').click()}
    });

    $('#suit').keydown(function(event){
        if (event.keyCode === 13){document.getElementById('sendMessage').click()}
    });

    $('#name').keydown(function(event){
        if (event.keyCode === 13){document.getElementById('connect').click()}
    });

});