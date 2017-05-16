import {Component} from '@angular/core';

@Component ({
    selector: 'pra-newsslider',
    template : ` <div class="pra-widget small news-slider" style="margin-bottom: 0px">
        <div class="pra-widget-content">
            <div class="flexslider">
              <ul>               
                    <li>
                      <div class="img" style="background-size: 100% 100%"></div>
                      <div class="title">Testing</div>
                      <div class="date">                         
                      </div>
                      <br />                       
                    </li>              
              </ul>
            </div>
        </div>
    </div>`,
    styleUrls : ['../app.component.css']
})

export class newsSliderComponent {}
