<%@include file="includes/header.jsp"%>

<script src="/resources/js/cards.js"></script>

<div>

    <div class="container" id="chatbox">
        <div class="col-md-10">
            <div class="row">
                <div id="conversationDiv" class="col-md-12">
                    <textarea class="textarea" disabled id="response" cols="30" rows="8"></textarea>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <input type="text" id="name" placeholder="Player Name"/>
                </div>
                <div class="col-md-9" id="conversationDiv2">
                    <select id="value">
                        <option>Ace</option>
                        <option>Two</option>
                        <option>Three</option>
                        <option>Four</option>
                        <option>Five</option>
                        <option>Six</option>
                        <option>Seven</option>
                        <option>Eight</option>
                        <option>Nine</option>
                        <option>Ten</option>
                        <option>Jack</option>
                        <option>Queen</option>
                        <option>King</option>
                    </select>

                    <select id="suit">
                        <option>Hearts</option>
                        <option>Clubs</option>
                        <option>Diamonds</option>
                        <option>Spades</option>
                    </select>
                    <button id="sendMessage" onclick="sendMessage();">Send</button>
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