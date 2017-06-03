$(document).ready(function() {

//All Variables
  var $popoverLink = $('[data-popover]'),
       $document = $(document)


function openPopover(e) {
    e.preventDefault()
    closePopover();
    var popover = $($(this).data('popover'));
    popover.toggleClass('open')
    popover.addClass('opene')
    e.stopImmediatePropagation();
  }

  function closePopover(e) {
    if($('.popover.open').length > 0) {
      $('.popover').removeClass('open')
    }
  }






  function init() {
    $popoverLink.on('click', openPopover)
    $document.on('click', closePopover)

  }
  init();
  });
