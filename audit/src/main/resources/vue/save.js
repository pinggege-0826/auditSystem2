//使用Vue渲染模板，初始化时是没有数据的，需要ajax请求拿到数据
var vue = new Vue({
    el: "#div",
    data: {
        info: null
    },
    methods:{
        del: function () {
            //根据用户名和年龄查询
            alert(1);
        }
    }
});

//使用layui分页
layui.use('laypage', function () {
    var laypage = layui.laypage;

    laypage.render({
        elem: 'fenYe'
        , count: totalCount
        , limit :8
        , groups:5
        , layout: ['count', 'prev', 'page', 'next', 'refresh', 'skip']
        , jump: function (obj, first) {
            //点击非第一页页码时的处理逻辑。比如这里调用了ajax方法，异步获取分页数据
            if (!first) {
                pagination(obj.curr, obj.limit);//第二个参数不能用变量pageSize，因为当切换每页大小的时候会出问题
            }
        }
    });
    var nums=8;
});

var pageIndex = 1;
var pageSize = 8;
var totalCount = 0;
pagination(pageIndex, pageSize);
function pagination(pageIndex, pageSize) {
    //查询条件
    var param = {
        currPage: pageIndex,
        pageSize: pageSize,
        //其它查询条件可在下面添加
    };
    $.ajax({
        type: 'POST',
        url: '/findAllMessage',
        dataType: 'json',
        data: param,
        async: false,//这里设置为同步执行，目的是等数据加载完再调用layui分页组件，不然分页组件拿不到totalCount的值
        success: function (data) {
            vue.info = data.list;
            totalCount = data.totalPage;
        }
    });
};