$(document).ready(function() {
    $.ajax({
        url: "https://apex.oracle.com/pls/apex/pierrealli/hr/employees/"
    }).then(function(data) {
       for(i=0; i<data.items.length;i++) {
       $('.ename').append(data.items[i].ename);
       $('.empno').append(data.items[i].empno);
       }
    });
});


function AjaxSucceeded(result) {
  swal("Deleted!",
  "Your imaginary file has been deleted.",
  "success");
}


function AjaxSucceedede(result) {
  swal("Updated!",
  "Your changes are succefully saved",
  "success");
}
function AjaxFailed(result) {
  swal("Deleted!",
  "Your imaginary file has been deleted.",
  "success");
}

function AjaxError(result) {
  swal(
  'Oops...',
  'Something went wrong!',
  'error'
)
}
