import { IprapocPage } from './app.po';

describe('iprapoc App', () => {
  let page: IprapocPage;

  beforeEach(() => {
    page = new IprapocPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
