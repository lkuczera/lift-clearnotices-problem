    $(document).ready(function() { 
 
        $('#test').click(function() { 
        	$.blockUI({ message: $('#question'), css: { width: '275px' } }); 
        }); 
 
        $('#yes').click(function() { 
            // update the block message 
            $.blockUI({ message: "<h1>Remote call in progress...</h1>" }); 
 
            $.ajax({ 
                url: 'wait.php', 
                cache: false, 
                complete: function() { 
                    // unblock when remote call returns 
                    $.unblockUI(); 
                } 
            }); 
        }); 
 
        $('#no').click(function() { 
            $.unblockUI(); 
            return false; 
        }); 
 
    }); 


function blockMessage() {
	$.blockUI({ message: "<h2>Remote call in progress...</h2>" });
}

function unblock() {
	$.unblockUI();
}