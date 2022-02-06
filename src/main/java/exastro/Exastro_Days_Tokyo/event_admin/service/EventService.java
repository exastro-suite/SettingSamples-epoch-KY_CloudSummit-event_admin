/*   Copyright 2021 NEC Corporation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package exastro.Exastro_Days_Tokyo.event_admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import exastro.Exastro_Days_Tokyo.event_admin.service.dto.EventDetailDto;
import exastro.Exastro_Days_Tokyo.event_admin.service.dto.EventDto;

@Service
public interface EventService {

	public List<EventDto> getEvent();

	public String updateEvent(EventDetailDto eventDetail, String cud);
	
//	public String registerEvent(EventDetailDto eventDetail);
}
