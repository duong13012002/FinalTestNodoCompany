import { TestBed } from '@angular/core/testing';

import { RightService } from './right.service';

describe('RightService', () => {
  let service: RightService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RightService);
  });

  it('Should be created', () => {
    expect(service).toBeTruthy();
  });
});
