/*
 * Copyright (c) 2016 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF MERCHANTABILITY OR FITNESS
 * FOR A PARTICULAR PURPOSE. The software and documentation provided hereunder
 * is on an "as is" basis, and Memorial Sloan-Kettering Cancer Center has no
 * obligations to provide maintenance, support, updates, enhancements or
 * modifications. In no event shall Memorial Sloan-Kettering Cancer Center be
 * liable to any party for direct, indirect, special, incidental or
 * consequential damages, including lost profits, arising out of the use of this
 * software and its documentation, even if Memorial Sloan-Kettering Cancer
 * Center has been advised of the possibility of such damage.
 */

/*
 * This file is part of cBioPortal.
 *
 * cBioPortal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.cbioportal.persistence.mybatis;

/**
 *
 * @author heinsz
 */

import java.util.*;
import org.cbioportal.model.*;
import org.cbioportal.persistence.GenePanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenePanelMyBatisRepository implements GenePanelRepository {

    @Autowired
    GenePanelMapper genePanelMapper;

    @Override
    public String getGenePanelBySampleIdAndProfileId(String sampleId, String profileId) {
        return genePanelMapper.getGenePanelBySampleIdAndProfileId(sampleId, profileId);
    }

    // TODO: All of the below methods are for importing purposes only. They should be
    // removed once a proper import solution is put in place.
    @Override
    public List<GenePanel> getGenePanelByStableId(String stableId) {
        return genePanelMapper.getGenePanelByStableId(stableId);
    }
    
    @Override
    public List<GenePanel> getGenePanels() {        
        return genePanelMapper.getGenePanels();
    }

    @Override
    public Sample getSampleByStableIdAndStudyId(String stableId, String studyId) {
        return genePanelMapper.getSampleByStableIdAndStudyId(stableId, studyId);
    }

    @Override
    public GeneticProfile getGeneticProfileByStableId(String stableId) {
        return genePanelMapper.getGeneticProfileByStableId(stableId);
    }

    @Override
    public Gene getGeneByEntrezGeneId(Integer geneId) {
        return genePanelMapper.getGeneByEntrezGeneId(geneId);
    }

    @Override
    public Gene getGeneByHugoSymbol(String symbol) {
        return genePanelMapper.getGeneByHugoSymbol(symbol);
    }

    @Override
    public Gene getGeneByAlias(String symbol) {
        return genePanelMapper.getGeneByAlias(symbol);
    }

    @Override
    public boolean sampleProfileMappingExistsByProfile(Integer profileId) {
        return genePanelMapper.sampleProfileMappingExistsByProfile(profileId) != 0;
    }
    
    @Override
    public boolean sampleProfileMappingExistsByPanel(Integer panelId) { 
        return genePanelMapper.sampleProfileMappingExistsByPanel(panelId) != 0;
    }

    @Override
    public void insertGenePanel(Map<String, Object> map) {
        genePanelMapper.insertGenePanel(map);
    }

    @Override
    public void deleteGenePanel(Integer internalId) {
        genePanelMapper.deleteGenePanel(internalId);
    }

    @Override
    public void deleteGenePanelList(Integer internalId) {
        genePanelMapper.deleteGenePanelList(internalId);
    }

    @Override
    public void deleteSampleProfileMappingByProfile(Integer profileId) {
        genePanelMapper.deleteSampleProfileMappingByProfile(profileId);
    }

    @Override
    public void deleteSampleProfileMappingByPanel(Integer panelId) {
        genePanelMapper.deleteSampleProfileMappingByPanel(panelId);
    }

    @Override
    public void insertGenePanelList(Map<String, Object> map) {
        genePanelMapper.insertGenePanelList(map);
    }

    @Override
    public void insertGenePanelListByHugo(Map<String, Object> map) {
        genePanelMapper.insertGenePanelListByHugo(map);
    }

    @Override
    public void insertGenePanelSampleProfileMap(Map<String, Object> map) {
        genePanelMapper.insertGenePanelSampleProfileMap(map);
    }

    public void setGenePanelMapper(GenePanelMapper genePanelMapper) {
        this.genePanelMapper = genePanelMapper;
    }
}
