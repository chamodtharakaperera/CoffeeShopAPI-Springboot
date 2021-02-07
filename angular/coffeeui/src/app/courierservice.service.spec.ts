import { TestBed } from '@angular/core/testing';

import { CourierserviceService } from './courierservice.service';

describe('CourierserviceService', () => {
  let service: CourierserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CourierserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
