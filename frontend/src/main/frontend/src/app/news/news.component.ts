import {Component} from '@angular/core';

@Component ({
    selector : 'pra-news',
    template : `<div class="pra-widget fillup">
         <table width="100%" cellspacing="0" cellpadding="0">
            <tr>
                <!-- PRA Featured Article -->
                <td width="350px" style="border: 0; padding: 0;float: left;">
                    <table width="350px" height="250px" border="0">
                        <tr>
                          <td style="background-image:url('../../images/dashboard_logo.png'); background-size: cover; background-repeat: no-repeat; vertical-align: bottom; padding: 0">
                                <div class="widgetimg pink-gradient">
                                  <a href="#" style="color: #FFFFFF !important;">
                                    <span style=" color: #FFFFFF; ">PRA NEWS</span>
                                  </a>
                                </div>
                            </td>
                        </tr>
                    </table> 
                     <article style="width: 350px">
                       <h2 class="title"><a href="#">Sample News</a></h2>
                       <p class="date">MON, Apr 1, 2015
                       </p>
                       <p class="excerpt">Dynamic content to be loaded from DB</p><br />
                       <a class="read-more" href="#" style="float: left;">Read Full Article</a>
                       <span class="read-morearrow">&#8594;</span>
                    </article>  
                 </td>
                  <!-- PRA News Feed -->
                <td style="border: 0; padding: 0; background: linear-gradient(to bottom, #f9f9f9, #dedcdc);filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f9f9f9', endColorstr='#dedcdc',GradientType=0 ); width: 100%">
                    <ul class="pra-news-feed">                          
                      <li>
                        <h3 class="title"><a href="#">
                          News 1</a></h3>
                        <div class="date">THU, May 11, 2015
                        </div>
                      </li>
                      <li>
                        <h3 class="title"><a href="https://pra--c.na28.visual.force.com/apex/IPA_Article?Id=a7B1A000000GyhMUAS">
                          News 2</a></h3>
                        <div class="date">TUE, May 09, 2015
                        </div>
                      </li>
                      <li>
                        <h3 class="title"><a href="https://pra--c.na28.visual.force.com/apex/IPA_Article?Id=a7B1A000000GyVkUAK">
                          News 3</a></h3>
                        <div class="date">FRI, May 05, 2015
                        </div>
                      </li>                                                        
                    </ul>
                </td>
            </tr>
            </table>
        </div>`,
        styleUrls : ['../app.component.css']
})

export class newsComponent {}
