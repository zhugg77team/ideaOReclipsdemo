/**
 * Created by Administrator on 2016/3/14.
 */
$(function(){
    alert("大家好");
    $('#addemp').click(function(){
        var eid=$('#id').val();
        var empname=$('#empname').val();
        var param={"id":eid,"empname":empname};
        if(eid&&empname){
            $.ajax({
                type: "POST",
                url: "/add",
                contentType: 'application/json',
                data: JSON.stringify(param),
                dataType: "json",
                success: function(data){
                    var div=$('#resText');
                    $('#resText').html("新增加的员工是："+data.id+":"+data.empname);
                }
            });
        }else{
            alert("提示：请保证有正确的值");
        }

    });
    $('#addemp2post').click(function(){
        var eid=$('#id').val();
        var empname=$('#empname').val();
        var param={"id":eid,"empname":empname};
        if(eid&&empname){
            $.post("/add", {'emp':param}, function (result) {
                    var div=$('#resText');
                    $('#resText').html("新增加的员工是："+data.id+":"+data.empname);
                },"json"
            );
        }else{
            alert("提示：请保证有正确的值");
        }

    });
});
