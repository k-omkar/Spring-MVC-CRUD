$(function() {
    $('#messages li').on('click',function() {
        $(this).fadeOut();
    });
    setTimeout(function() {
        $('#messages li.info').fadeOut();
    }, 2000);
});