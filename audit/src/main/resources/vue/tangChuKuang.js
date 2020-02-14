var socket;
if(typeof(WebSocket) == "undefined") {
    alert("您的浏览器不支持WebSocket");
}else{
    //实现化WebSocket对象，指定要连接的服务器地址与端口  建立连接
    socket = new WebSocket("ws://localhost:9930/websocket");

    //打开事件
    socket.onopen = function() {
        //alert("Socket 已打开");
        socket.send("这是来自客户端的消息" + location.href + new Date());
    };
    //获得消息事件
    socket.onmessage = function(msg) {
        //发现消息进入    开始处理前端触发逻辑（弹出）
        if(msg.data === "cuXiao"){
            tangChuCen("促销审核");
        }
    };
    //关闭事件
    socket.onclose = function() {
        //alert("Socket已关闭");
    };
    //发生了错误事件
    socket.onerror = function() {
        alert("Socket发生了错误");
        //此时可以尝试刷新页面
        window.location.reload();
    }
}

function tangChuCen(msg){
layer.confirm(msg+'有一条新消息,您收到了吗？', {
    btn: ['是','否'] //按钮
}, function(){
    layer.msg('收到了！', {
        time: 1000, //0.5s后自动关闭
        icon: 1});
}, function(){
    layer.msg('稍后再说', {
        time: 1000 //0.5s后自动关闭
    });
});
}



