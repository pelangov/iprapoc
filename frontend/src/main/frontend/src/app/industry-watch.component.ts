import {Component} from '@angular/core';

@Component ({
    selector: 'pra-industrywatch',
    template : `<div class="news-verticals">
        <div class="pra-widget group">        
            <div class="flexslider" id="pra-industry-watch">
              <ul>                
                   <li>
                     <figure></figure>
                     <div style="margin-top: 5px;">
	                     <a class="news-category" style="margin: 1.5em 0 0em;">Industry Watch</a>
	                     <h2 class="title">
	                        Industry watch
	                    </h2>
	                    <p class="date">	                        
	                    </p>
	                    <p class="excerpt">Teaser...</p>
	                 </div>  
                   </li>               
              </ul>
            </div>
        </div>
    </div>`,
    styleUrls: ['./app.component.css']    
})

export class industryWatchComponent {}