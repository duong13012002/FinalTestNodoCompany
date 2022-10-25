import { TestBed } from '@angular/core/testing';

import { QuyenMenuService } from './quyen-menu.service';

describe('NhomQuyenMenuService', () => {
  let service: QuyenMenuService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(QuyenMenuService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
