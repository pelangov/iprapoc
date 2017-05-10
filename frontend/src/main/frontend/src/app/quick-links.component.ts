import {Component} from '@angular/core';

@Component ({
    selector: 'pra-quicklinks',
    template : `<div class="pra-widget small quick-links" id="divQL" style="margin-bottom: 10px">
    	<div class="widget-title blue-gradient">
	        <span class="widgettitle "><i class="pra-icon-quick-link"></i></span>
	    </div>   
	    <div class="pra-widget-content" style="padding-right: 5px;">
	      <ul>                 
	         <li>	                   
	               	<i style="display:inline-block"></i>	                
	         </li>	              
	      </ul>
        </div>
    </div>`,
    styleUrls: ['./app.component.css']
})

export class quickLinksComponent {}