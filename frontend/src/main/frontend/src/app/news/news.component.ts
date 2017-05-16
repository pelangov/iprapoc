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
                            <td style= "background-size: cover; background-repeat: no-repeat; vertical-align: bottom; padding: 0">
                                <div class="widgetimg pink-gradient">
                                    <a style="color: #FFFFFF !important;">                                    
                                        <span style=" color: #FFFFFF; ">PRA NEWS</span>
                                    </a>
                                </div>
                            </td>
                        </tr>
                    </table> 
                     <article style="width: 350px">                        
                        <p class="date">
                            Display Date
                        </p>
                        <p class="excerpt">News Teaser...</p><br />
                        <a class="read-more" style="float: left;">Read Full Article</a>
                        <span class="read-morearrow">→</span>
                    </article>  
                 </td>
                  <!-- PRA News Feed -->
                <td style="border: 0; padding: 0; background: linear-gradient(to bottom, #f9f9f9, #dedcdc);filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f9f9f9', endColorstr='#dedcdc',GradientType=0 ); width: 100%">
                    <ul class="pra-news-feed">                        
                            <li>
                                <h3 class="title">
                                Repeat list
                                </h3>
                                <div class="date">                                     
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
