$(document).ready(function () {
    refalsh();
    setCheck(true);
    $('.duibi').on('click', function (event) {
        var loclarr = $.cookie('schoolName');//localStorage.getItem('schoolName');
        if (loclarr) {
            loclarr = loclarr.split(',');
        } else {
            loclarr = [];
        }
        var xuexiaomingcheng = $(this).attr("data");
        var zhuanye = $(this).attr("zhuanye");
        var id = $(this).attr("value");
        var schoolHtml
        if(zhuanye==null||zhuanye==''){
            schoolHtml = id + '-' + xuexiaomingcheng
        }else{
            schoolHtml = id + '-' + xuexiaomingcheng+'-'+zhuanye
        }
        var ischeck = $(this).is(':checked');
        if (ischeck) {
            if (loclarr.length == 6) {
                alert('最多选中6所大学！')
                $(this).prop('checked', false);
            } else {
                loclarr.push(schoolHtml);
                loclarr = loclarr.join();
                //1111111111111111localStorage.setItem('schoolName',loclarr);
                $.cookie('schoolName', loclarr, {expires: 1, path: '/', domain: document.domain});
            }

        } else {
            //删除localStroge的值
            removeLocal(loclarr, schoolHtml);
        }
        refalsh();

        //zyl scrollSlide();
    });
    // $('body').on('click', '.comp', function () {
    //     $(this).animate({
    //         'left': '-110px',
    //         'height': '0'
    //     }, 500, function () {
    //         $(this).remove();
    //     });
    //     var loclarr = $.cookie('schoolName');
    //     '';//localStorage.getItem('schoolName');
    //     if (loclarr) {
    //         loclarr = loclarr.split(',');
    //     } else {
    //         loclarr = [];
    //     }
    //     var schoolHtml = $(this).attr('val');
    //     removeLocal(loclarr, schoolHtml);
    //
    //     showInput();
    // })
    // $('body').on('click', '.clearbothp', function () {
    //     $.cookie('schoolName', '', {expires: 1, path: '/', domain: document.domain});//localStorage.removeItem('schoolName');
    //     $.cookie('sys_compare_School', '', {expires: 1, path: '/', domain: document.domain});
    //
    //     showInput();
    // })
    //

    refalsh();

    // 差掉结果
    $('body').on('click', '.school_lq_close', function () {
        var schoolHtml = $(this).parent().siblings('a').find('strong').html();
        var loclarr = $.cookie('schoolName');//localStorage.getItem('schoolName');
        if (loclarr) {
            loclarr = loclarr.split(',');
        } else {
            loclarr = [];
        }
        removeLocal(loclarr, schoolHtml);

        refalsh();
    })

    // 对比栏数据刷新

    


    // 显示已经选中的单选按钮
    function showInput() {
        var schoolName = $.cookie('schoolName');//localStorage.getItem('schoolName');
        if (schoolName) {
            schoolName = schoolName.split(',');
            var schoolNum = $('.lin-sechple-table tbody').find('tr').length;
            for (var m = 0; m < schoolNum; m++) {
                var schoolTr = $('.lin-sechple-table tbody').find('tr');
                var schoolA = schoolTr.eq(m).find('a').html();
                if (schoolA) {
                    if (schoolA.indexOf('getJsXml') > -1) {
                        schoolA = schoolTr.eq(m).find('font').html();
                    } else if (schoolA.indexOf('...') > -1) {
                        schoolA = schoolTr.eq(m).find('a').attr('title');
                    }
                }
                $('.lin-sechple-table tbody').find('tr').eq(m).find('input').prop('checked', false);
                for (var n = 0; n < schoolName.length; n++) {
                    if (schoolA == schoolName[n]) {
                        $('.lin-sechple-table tbody').find('tr').eq(m).find('input').prop('checked', true);
                    }
                }
            }
        } else {
            $('.lin-sechple-table tbody').find('input').prop('checked', false);
        }

    }

    function setCheck(status,id) {
        if(id){
            if(document.getElementById(id)!=null){
                document.getElementById(id) .checked = status;
            }
        }else{
            var schoolName = $.cookie('schoolName');
            if (schoolName) {
                schoolName = schoolName.split(',');
                for (var m = 0; m < schoolName.length; m++) {
                    if(document.getElementById(schoolName[m].split("-")[0]+"")){
                        document.getElementById(schoolName[m].split("-")[0]+"").checked = status;
                    }
                }
            }
        }

    }


    // 删除本地存储



    $('.cp-bt').click(function () {
        window.location.href = "/soudaxue/schoolcompare.htm";
    });
    $('.comparebox-p .icon-close').on('click', function () {
        $('.comparebox .comparebox-par1').hide();
    });


    //点击高校对比的跳转
    if ($('.li-collegeUl').length) {
        $('.li-collegeUl').on('click', '.li-school-label button', function () {
            $('.comparebox-par1').show();
            $('.comparebox-p').show();
            var loclarr = $.cookie('schoolName');//localStorage.getItem('schoolName');
            if (loclarr) {
                loclarr = loclarr.split(',');
            } else {
                loclarr = [];
            }
            var schoolHtml = $(this).siblings('span').html();
            if (loclarr.join(',').indexOf(schoolHtml) > -1) {
                alert('该学校已经加入对比！')
            } else {
                loclarr.push(schoolHtml);
                loclarr = loclarr.join();
                $.cookie('schoolName', loclarr, {expires: 1, path: '/', domain: document.domain});//localStorage.setItem('schoolName',loclarr);
                refalsh();

                place();
                //zyl scrollSlide();
            }

        })
    }

    $('body').on('click', '#gkfschoolcompare', function () {
        $('.comparebox-par1').show();
        $('.comparebox-p').show();
        var loclarr = $.cookie('schoolName');//localStorage.getItem('schoolName');
        if (loclarr) {
            loclarr = loclarr.split(',');
        } else {
            loclarr = [];
        }
        var schoolHtml = $('#gkfschoolname').find('a').html();
        if (loclarr.join(',').indexOf(schoolHtml) > -1) {
            alert('该学校已经加入对比！')
        } else {
            loclarr.push(schoolHtml);
            loclarr = loclarr.join();
            $.cookie('schoolName', loclarr, {expires: 1, path: '/', domain: document.domain}); //localStorage.setItem('schoolName',loclarr);
            refalsh();

            place();
            //zyl scrollSlide();
        }
    })

    // 距离左边位置
    function place() {
        var Wwidth = $(document.body).width();
        var newleft = Wwidth / 2 + 500 + 20 + 'px';
        $('.comparebox').css('left', newleft);

    }

    place();
    $(window).resize(place);
    //console.log(mm);
    // 上下滚动
//  $(window).scroll(function() {
//    var l = true;
//    scrollSlide(l);
//  });
    function boxscroll(moveTop) {
        $('.lin-searchtabl-ratio').animate({
            'top': moveTop
        }, 55);
    }

//  function scrollSlide(l) {
//    var scrolltop = $(window).scrollTop() + 130 + 'px';
//    var scrolltop2 = $(window).scrollTop() + 570 + 'px';
//    if($(".lin-searchtabl-ratio").length > 0){
//      var top = $(".lin-searchtabl-ratio").offset().top;
//      //console.log(top);
//      var scrolla=$(window).scrollTop();
//      //console.log(scrolla);
//      var dis = parseInt(top) - parseInt(scrolla) -500;
//      var Wwidth = $(document.body).width();
//      var parentTop = $('.lin-searchtabl-ratio').parent().position().top;
//      var fixTop = parentTop+57;
//      var newleft2 = (Wwidth - 1000)/2 + 750;
//      var moveTop = scrolla - parentTop;
//      var moveBot = height-93+'px';
//      moveBot = String(moveBot);
//      console.log(moveBot);
//      var parentBot = parentTop+height-93;
//      //console.log($('.lin-searchtabl-ratio').position().top);
//      var h = $('.lin-searchtabl-ratio').position().top
//      $('.comparebox').animate({
//          'top': scrolltop
//      }, 55);
//      console.log(height);
//      if(scrolla>fixTop){
//			if(h > 676){
//				console.log($('.lin-searchtabl-ratio').position().top);
//				console.log('aaa');
//				//$('.lin-searchtabl-ratio').css('position', 'absolute').css('top','676px');
////				$('.lin-searchtabl-ratio').animate({
////	        	'top': '676px'
////	    		}, 55);
//				l=false;
//				$('.lin-searchtabl-ratio').css('position', 'absolute').css('top','676px');
//
//			}else{
//				if(moveTop<676){
//					$('.lin-searchtabl-ratio').animate({
//		        	'top': moveTop
//		    		}, 55);
//				}
//
//	    		console.log('bbb');
//
//			}
//	    	//console.log($('.lin-searchtabl-ratio').css('top'));
//	    	//console.log(height-93);
//      }
//      if(l && dis<=0)
//      {
//       // $('.lin-searchtabl-ratio').css('position', 'absolute').css('left', newleft2).css('top',0);
//       $('.lin-searchtabl-ratio').css('position', 'absolute').css('top','57px');
//        l=false;
//      }
//      if(!l && dis>0)
//      {
//        $('.lin-searchtabl-ratio').css('position', 'absolute');
//        l=true;
//
//      }
//
//    }

    //  }
});


function refalsh() {
    var schoolName = $.cookie('schoolName');//localStorage.getItem('schoolName');
    $("#schools").empty();
    if (schoolName) {
        schoolName = schoolName.split(',');
        var schoolNameHtml = '';
        schoolNameHtml+='<li><a href="/com" style="display:inline-block">对比</a></li>'
        for (var i = 0; i < schoolName.length; i++) {
            names = schoolName[i].split("-");
            //<li><a href="#">Action</a></li>
            schoolNameHtml += '<li><a href="#" style="display:inline-block">' + names[1] + '</a><a href="#" data=' + schoolName[i] + ' style="display:inline-block" class="delete">删除</a></li>'
            // '<div><li role="presentation" class="divider"></li><li><a href="#">' + names[1] + '</a><button id=' + names[0] + ' class="shanchu">删除</button></li></div>'
        }
        $("#schools").append(schoolNameHtml)
        $(".delete").on("click",function () {
            var id = $(this).attr("data");
            var loclarr = $.cookie('schoolName').split(',');
            removeLocal(loclarr, id);
            refalsh();
            setCheck(false,id.split("-")[0])
        })
    }
}

function removeLocal(loclarr, schoolHtml) {
    //删除localStroge的值
    Array.prototype.remove = function (val) {
        var index = this.indexOf(val);
        if (index > -1) {
            this.splice(index, 1);
        }
    };
    loclarr.remove(schoolHtml);
    loclarr = loclarr.join();
    $.cookie('schoolName', loclarr, {expires: 1, path: '/', domain: document.domain});//localStorage.setItem('schoolName',loclarr);
}