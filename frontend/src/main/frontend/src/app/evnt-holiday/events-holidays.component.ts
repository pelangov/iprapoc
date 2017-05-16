import {Component} from '@angular/core';

@Component ({
    selector: 'pra-eventsholidays',
    template : ` <div class="pra-widget small events-holidays" id="divEvents" style="margin-bottom:10px">
    	<div class="widget-title orange-gradient" >
        	<span class="widgettitle">
           <i class="pra-icon-events-holidays"></i></span>
        </div>    
        <div class="pra-widget-content">
        	<div class="events">
            	<p class="events-title">Upcoming Events</p>
                	<ul>                    	
                        	<li>
                          		<table width="100%">
                             		<tr>
                               			<td style="border: 0; width: 40px; text-align: left; vertical-align: middle"> 
                                 			<div class="date">
                                   				<span class="month">                                     				
                                    			</span>
                                    			<span class="day">                                      				
                                    			</span>
                                  			</div>
                                 		</td>
                                 		<td style="border: 0; text-align: left; vertical-align: middle">
                                   			<div class="title">                                      			
                                    		</div>
                                  		</td>
                                	</tr>  
                             	</table>    
                           	</li>                      
                    </ul>
               </div>

	           <div class="holidays" >
	                <p class="events-title">Events and Office Closings</p>
	                <ul>	                    
	                        <li>
	                            <table width="100%">
	                                <tr>
	                                    <td style="border: 0; width: 40px; text-align: left; vertical-align: middle">
	                                        <div class="date" >
	                                            <span class="month">	                                             
	                                            </span>
	                                            <span class="day">	                                                
	                                            </span>
	                                         </div>
	                                    </td>
	                                    <td style="border: 0; text-align: left; vertical-align: middle">
	                                        <div class="title" >	                                           
	                                        </div>
	                                    </td>
	                                </tr> 
	                            </table>     
	                         </li>	                 
	                </ul>
	            </div>
                <a class="read-more">View Full Calendar</a>
                 <span class="read-morearrow">→</span>
        </div>      
      </div>`,
    styleUrls: ['../app.component.css']
})

export class eventsHolidaysComponent {}
