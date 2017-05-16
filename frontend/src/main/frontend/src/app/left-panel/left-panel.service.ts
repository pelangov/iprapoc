import {Injectable} from '@angular/core';
import {Http,Response, Headers, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable'
import {Link} from './link';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Logger} from "angular2-logger/core";




@Injectable()
  export class LeftPanelService {

  private menuLinksUrl = 'https://iprapoc.herokuapp.com/api/leftMenuLinks/json';

  headers: Headers;
  options: RequestOptions;
  constructor(private http: Http, private  logger: Logger) {
  }

  getLeftMenuLinks(): Observable<Link[]> {
    return this.http.get(this.menuLinksUrl)
      .map(res => res.json())
  }
   extractData(res: Response) {
    let body = res.json();
    return body || {};
  }
  private handleError (error: Response | any) {
    // In a real world app, you might use a remote logging infrastructure
    let errMsg: string;
    if (error instanceof Response) {
      const body = error.json() || '';
      const err = body.error || JSON.stringify(body);
      errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
    } else {
      errMsg = error.message ? error.message : error.toString();
    }
    console.error(errMsg);
    return Observable.throw(errMsg);
  }

}
