<%@include file="includes/header.jsp"%>

<script src="/resources/js/chat.js"></script>

<div>

    <div class="container" id="chatbox">
        <div class="col-md-10">
            <div class="row">
                <div id="conversationDiv" class="col-md-12">
                    <p id="response"></p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <input type="text" id="from" placeholder="Choose a nickname"/>
                </div>
                <div class="col-md-9">
                    <div id="conversationDiv2">
                        <input type="text" id="text" placeholder="Write a message..."/>
                        <button id="sendMessage" onclick="sendMessage();">Send</button>
                    </div>
                </div>
            </div>
            <div class="row">
            </br>
                <div class="col-md-12">
                    <button id="connect" onclick="connect();">Connect</button>
                    <button id="disconnect" disabled="disabled" onclick="disconnect();">
                        Disconnect
                    </button>
                </div>
            </div>
        </div>
    </div>

</div>

<%@include file="includes/footer.jsp"%>
