 interface RecordType {
    id: number;
    sfId: string;
    name: string;
  }

  interface SubLink {
    id: number;
    hcErr: any;
    hcLastop: any;
    category: string;
    createdDate: number;
    cssClass?: any;
    displayDate?: any;
    externalLink: boolean;
    isDeleted: boolean;
    link: string;
    linkType?: any;
    name: string;
    noOfSubSubMenus: number;
    page: string;
    subLinks: any[];
    recordType: RecordType;
    restrictedLink: boolean;
    sfId: string;
    siteLocations?: any;
    systemModStamp: number;
    url?: any;
    weight: number;
    sobjectIdChatterGroupId?: any;
  }

  interface RecordType2 {
    id: number;
    sfId: string;
    name: string;
  }

  export interface Link {
    id: number;
    hcErr: any;
    hcLastop: any;
    category: string;
    createdDate: number;
    cssClass: string;
    displayDate?: any;
    externalLink: boolean;
    isDeleted: boolean;
    link: string;
    linkType?: any;
    name: string;
    noOfSubSubMenus?: any;
    page?: any;
    subLinks: SubLink[];
    recordType: RecordType2;
    restrictedLink: boolean;
    sfId: string;
    siteLocations: string;
    systemModStamp: number;
    url: string;
    weight: number;
    sobjectIdChatterGroupId: any;
  }


