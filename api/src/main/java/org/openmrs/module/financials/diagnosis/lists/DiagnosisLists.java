package org.openmrs.module.financials.diagnosis.lists;

import org.openmrs.module.financials.EhrAddonsConstants;

import java.util.Arrays;
import java.util.List;

import static org.openmrs.module.financials.EhrAddonsConstants.getConcept;

public class DiagnosisLists {
	
	public static List<Integer> getDiarrheaDiagnosisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_DIARRHEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FUNCTIONAL_DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Hemorrhagic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Bacterial_Gastroenteritis).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.DIARRHEA_AMOEBIASIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.DIARRHOEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.DIARRHOEA_AND_GASTROENTERITIS_OF_PRESUMED_INFECTIOUS_ORIGIN)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.DIARRHEA_AND_GASTROENTERITIS_OF_PRESUMED_INFECTIOUS_ORIGIN_1)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_for_less_than_one_month)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.WHO_HIV_CRYPTOSPORIDIOSIS_WITH_DIARRHEA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Clostridium_Difficile_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Antibiotic_Associated_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Psychogenic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Protozoal_Diarrhoea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_of_Infectious_Origin).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Infectious_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_Resulting_from_Infection_of_the_Bowel_Mucosa)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Campylobacter_Diarrhoea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Dyspeptic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Allergic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Traveler_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Toddler_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Severe_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Secretory_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Raw_Milk_Associated_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Postcholecystectomy_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Poisoning_by_Antidiarrheal_Drug).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Post_Vagotomy_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_for_more_2_weeks).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_for_2_weeks).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.postvagotomy_diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.nausea_vomiting_and_diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.irritable_bowel_syndrome_without_diarrhoea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.diarrhea_due_to_drug).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Irritable_Bowel_Syndrome_with_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRONIC_DIARRHEA_1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Acute_diarrhea_more_than_three_stools_in_24_hours)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Adverse_Reaction_of_Antidiarrheal_Drug)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Bacterial_diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.diarrhea_bacterial).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Chronic_Diarrhea_of_Infants_and_Young_Children).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhoea_chronic_1_month_unexplained).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Chronic_diarrhea_of_unknown_origin).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Congenital_Secretory_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Congenital_Secretory_Diarrhea_Chloride_Type).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Congenital_Secretory_Diarrhea_Sodium_Type).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_After_Gastrointestinal_Tract_Surgery).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_due_to_Alcohol_Intake).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_due_to_Staphylococcus).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_in_Diabetes).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diarrhea_of_presumed_infectious_origin).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Dietetic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Drug_and_Toxin_Induced_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Dysenteric_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Epidemic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Functional_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Bloody_diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Hemorrhagic_diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Hill_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Diabetic_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Infective_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Neonatal_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Nervous_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Non_Infective_Diarrhea).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Osmotic_Diarrhea).getConceptId());
	}
	
	public static List<Integer> getTuberculosisDiagnosisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MILIARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.RESPIRATORY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EPTB).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HIV_STAGING_TUBERCULOSIS_WITHIN_YEAR).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculosis_Polyserositis).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculous_Pleurisy_in_Primary_Progressive_Tuberculosis)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Erythema_Nodosum_with_Hypersensitivity_Reaction_in_Tuberculosis)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculosis_of_Joint).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Addisons_Disease_due_to_Tuberculosis).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculosis_of_Urinary_Organs).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculosis_of_Ureter).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculosis_of_Thyroid_Gland).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Tuberculosis_of_Spleen).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TSS6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB58).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB59).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB60).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB61).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB62).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB63).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB64).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB65).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB66).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB67).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB68).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB69).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB70).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB71).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB72).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB73).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB74).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB75).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB76).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB77).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB78).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB79).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB80).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB81).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB82).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB83).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB84).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB85).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB86).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB87).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB88).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB89).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB90).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB91).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB92).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB93).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB94).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB95).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB96).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB97).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB98).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB99).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB100).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB101).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB102).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB103).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB104).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB105).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB106).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB107).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB108).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB109).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB110).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB111).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB112).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB113).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB114).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB115).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB116).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB117).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB118).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB119).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB120).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB121).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB122).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB123).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB124).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB125).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB126).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB127).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB128).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB129).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB130).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB131).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB132).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB133).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB134).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB135).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB136).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB137).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB138).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB139).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB140).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB141).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB142).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB143).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB144).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB145).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB146).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB147).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB148).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB149).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB150).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB151).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB152).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB153).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB154).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB155).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB156).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB157).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB158).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB159).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB160).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB161).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB162).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB163).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB164).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB165).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB166).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB167).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB168).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB169).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB170).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB171).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB172).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB173).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB174).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB175).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB176).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB177).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB178).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB179).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB180).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB181).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB182).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB183).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB184).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB185).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB186).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB187).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB188).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB189).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB190).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB191).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB192).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB193).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB194).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB195).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB196).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB197).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB198).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB199).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB200).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB201).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB202).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB204).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB205).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB203).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB206).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB207).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB208).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB209).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB210).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB211).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB212).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB213).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB214).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB215).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB216).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB217).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB218).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB219).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB220).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB221).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB222).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB223).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB224).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB225).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB226).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB227).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB228).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB229).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB230).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB231).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB232).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB233).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB234).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB235).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB236).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB237).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB238).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB239).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB240).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB241).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB242).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB243).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB244).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB245).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB246).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB247).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB248).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB249).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB250).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB251).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB252).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB253).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB254).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB255).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB256).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB257).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB258).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB259).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB260).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB261).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB262).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB263).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB264).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB265).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB266).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB267).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB268).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB269).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB270).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB271).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB272).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB273).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB274).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB275).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB276).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB277).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB278).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB279).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB280).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB281).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB282).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB283).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB284).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB285).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB286).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB287).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB288).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB289).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB290).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB291).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB292).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB293).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB294).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB295).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB296).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB297).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB298).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB299).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB300).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB301).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TB302).getConceptId()
		
		);
	}
	
	public static List<Integer> getDysenteryList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.DYSENTERY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.AMOEBIC_DYSENTERY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.SHIGELLA_DYSENTERY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.BACILLARY_DYSENTERY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Viral_Dysentery).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Haemorrhagic_Dysentery).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Catarrhal_Dysentery).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Acute_Amebic_Dysentery_without_Abscess).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Joint_problem_following_dysentery).getConceptId());
	}
	
	public static List<Integer> getCholeraList() {
		return Arrays
		        .asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.DIARRHEA_CHOLERA).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHOLERA).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Cholera_due_to_Vibrio_Cholerae).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Need_for_Vaccination_for_Cholera).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Pseudopancreatic_Cholera_Syndrome).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Poisoning_by_Cholera_Vaccine).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Hog_Cholera).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Cholera_due_to_Vibrio_Cholerae_El_Tor).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Cholera_Contact).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Cholera_Carrier).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHOLERA_1).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.Adverse_Reaction_to_Cholera_Vaccine).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.accidental_cholera_vaccine_poisoning).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.cholera_due_to_vibrio_cholerae_01_biovar_cholerae)
		                    .getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.cholera_due_to_vibrio_cholerae_01_biovar_El_Tor)
		                    .getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.cholera_vaccine_adverse_reaction).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.cholera_vaccine_poisoning_of_undetermined_intent)
		                    .getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.intentional_cholera_vaccine_poisoning).getConceptId()
		        
		        );
	}
	
	public static List<Integer> getMeningococcalMeningitisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.MENINGOCOCCAL_MENINGITIS).getConceptId());
	}
	
	public static List<Integer> getOtherMenigitisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.BACTERIAL_MENINGITIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CRYPTOCOCCAL_MENINGITIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.VIRAL_MENINGITIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OM55).getConceptId()
		
		);
	}
	
	public static List<Integer> getPoliomyelitisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PLY34).getConceptId()
		
		);
	}
	
	public static List<Integer> getNeonatalTetanusList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.TETANUS_NEONATORUM).getConceptId());
	}
	
	public static List<Integer> getChickenPoxList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHICKEN_POX).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CP2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CP3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CP4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CP5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CP6).getConceptId());
	}
	
	public static List<Integer> getMeaslesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.MEASLES).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MSC20).getConceptId()
		
		);
	}
	
	public static List<Integer> getHepatitisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP58).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP59).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP60).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP61).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP62).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP63).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP64).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP65).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP66).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP67).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP68).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP69).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP70).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP71).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP72).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP73).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP74).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP75).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP76).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP77).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP78).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP79).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP80).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP81).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP82).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP83).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP84).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP85).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP86).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP87).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP88).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP89).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP90).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP91).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP92).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP93).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP94).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP95).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP96).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP97).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP98).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP99).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP100).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP101).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP102).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP103).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP104).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP105).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP106).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP107).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP108).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP109).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP110).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP111).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP112).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP113).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HP114).getConceptId()
		
		);
	}
	
	public static List<Integer> getMumpsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MUMPS22).getConceptId()
		
		);
	}
	
	public static List<Integer> getFeversList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER58).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER59).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER60).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER61).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER62).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER63).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER64).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER65).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER66).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER67).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER68).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER69).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER70).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER71).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER72).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER73).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER74).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER75).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER76).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER77).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER78).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER79).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER80).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER81).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER82).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER83).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER84).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER85).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER86).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER87).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER88).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER89).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER90).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER91).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER92).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER93).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER94).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER95).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER96).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER97).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER98).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER99).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER100).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER101).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER102).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER103).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER103).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER104).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER105).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER106).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER107).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER108).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER109).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER110).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER111).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER112).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER113).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER114).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER115).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER116).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER117).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER118).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER119).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER120).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER121).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER122).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER123).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER124).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER125).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER126).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER127).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER128).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER129).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER130).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER131).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER132).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER133).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER134).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER135).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER136).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER137).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER138).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER139).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER140).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.FEVER141).getConceptId()
		
		);
	}
	
	public static List<Integer> getMalariaList() {
		return Arrays.asList(
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_MILD).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_SEVERE).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_PRESUMED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_RULE_OUT).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_R_O).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_CLINICAL).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CLINICAL_MALARIA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UNSPECIFIED_MALARIA).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Maternal_Malaria_with_Delivery).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malarial_Fever).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Complicated_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALARIA_1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Haemolytic_Anaemia_due_to_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Falciparum_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Vivax_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Therapeutically_Induced_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Simian_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Quartan_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malariae_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Poisoning_by_Antimalarial_Drug).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Ovale_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Other_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Mixed_Malaria).getConceptId(),
		    getConcept(
		        EhrAddonsConstants._EhrAddOnConcepts.Maternal_Malaria_with_Delivery_with_Current_Postpartum_Complication)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Maternal_Malaria_During_Pregnancy_Baby_Not_Yet_Delivered)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malaria_in_pregnancy).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malarial_Nephrosis).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malarial_Hepatitis).getConceptId(),
		    getConcept(
		        EhrAddonsConstants._EhrAddOnConcepts.Malaria_in_Mother_Complicating_Pregnancy_Childbirth_and_or_Puerperium)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malaria_during_pregnancy)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Induced_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.hyper_reactive_malarial_splenomegaly).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.HO_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Congenital_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Cerebral_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Algid_Malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Plasmodium_Falciparum_Malaria_with_Cerebral_Complications)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Plasmodium_Malariae_Malaria_with_Nephropathy).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.congenital_falciparum_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Plasmodium_vivax_malaria_with_rupture_of_spleen).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Uncomplicated_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malaria_uncomplicated).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malaria_confirmed).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Presumptive_malaria_with_minor_digestive_system).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Malaria_confirmed_with_minor_digestive_symptoms).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Presumptive_malaria_with_pregnancy).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Confirmed_malaria_with_pregnancy).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Presumptive_malaria_with_minor_digestive_symptoms_pregnant)
		            .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Confirmed_malaria_with_minor_digestive_symptoms_pregnant)
		            .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Severe_malaria).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Non_falciparum_malaria).getConceptId());
	}
	
	public static List<Integer> getUrinaryTractInfectionList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.UTI25).getConceptId()
		
		);
	}
	
	public static List<Integer> getTyphoidList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.TF1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TF2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TF3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TF4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TF5).getConceptId()
		
		);
	}
	
	public static List<Integer> getBilharziaList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.BL1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.BL2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.BL3).getConceptId()
		
		);
	}
	
	public static List<Integer> getInterstinalwormsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ISW1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ISW2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ISW3).getConceptId()
		
		);
	}
	
	public static List<Integer> getMalnutritionList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MALN30).getConceptId()
		
		);
	}
	
	public static List<Integer> getAnaemiaList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA58).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA59).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA60).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA61).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA62).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA63).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA64).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA65).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA66).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA67).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA68).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA69).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA70).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA71).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA72).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA73).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA74).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA75).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA76).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA77).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA78).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA79).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA80).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA81).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA82).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA83).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA84).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA85).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA86).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA87).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA88).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA89).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA90).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA91).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA92).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA93).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA94).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA95).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA96).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA97).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA98).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA99).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA100).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA101).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA102).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA103).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA104).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA105).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA106).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA107).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA108).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA109).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA110).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA111).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA112).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA113).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA114).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA115).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA116).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA117).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA118).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA119).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA120).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA121).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA122).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA123).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA124).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA125).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA126).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA127).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA128).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA129).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA130).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA131).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA132).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA133).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA134).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA135).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA136).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA137).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA138).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA139).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA140).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA141).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA142).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA143).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA144).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA145).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA146).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA147).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA148).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA149).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA150).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA151).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA152).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ANEMIA153).getConceptId()
		
		);
	}
	
	public static List<Integer> getEyeInfectionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.EI1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EI2).getConceptId()
		
		);
	}
	
	public static List<Integer> getOtherEyeConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE58).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE59).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE60).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE61).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE62).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE63).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE64).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE65).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE66).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE67).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE68).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE69).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE70).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE71).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE72).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE73).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE74).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE75).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE76).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE77).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE78).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE79).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE80).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE81).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE82).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE83).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE84).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE85).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE86).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE87).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE88).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE89).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE90).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE91).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE92).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE93).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE94).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE95).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE96).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE97).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE98).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE99).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE100).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE101).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE102).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE103).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE104).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE105).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE106).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE107).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE108).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE110).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE111).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE112).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE113).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE114).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE115).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE116).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE117).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE118).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE119).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE120).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE121).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE122).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE123).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE124).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE125).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE126).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE127).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE128).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE129).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE130).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE131).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE132).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE133).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE134).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE135).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE136).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE137).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE138).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE139).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE140).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE141).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE142).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE143).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE144).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE145).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE146).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE147).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE148).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE149).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE150).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE151).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE152).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE153).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE154).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE155).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE156).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE157).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE158).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE159).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE160).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE161).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE162).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE163).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE164).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE165).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE166).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE167).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE168).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE169).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE170).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE171).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE172).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE173).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE174).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE175).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE176).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE177).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE178).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE179).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE180).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE181).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE182).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE183).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE184).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE185).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE186).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE187).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE188).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE189).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE190).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE191).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE192).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE193).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE194).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE195).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE196).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE197).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE198).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE199).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE200).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE201).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE202).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE203).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE204).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE205).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE206).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE207).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE208).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE209).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE210).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE211).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE212).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE213).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE214).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE215).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE216).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE217).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE218).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE219).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE220).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE221).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE222).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE223).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE224).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE225).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE226).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE227).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE228).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE229).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE230).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE231).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE232).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE233).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE234).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE235).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE236).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE237).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE238).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE239).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE240).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE241).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE242).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE243).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE244).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE245).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE246).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE247).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE248).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE249).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE250).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE251).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE252).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE253).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE254).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE255).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE256).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE257).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE258).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE259).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE260).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE261).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE262).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE263).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE264).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE265).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE266).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE267).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE268).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE269).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE270).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE271).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE272).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE273).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE274).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE275).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE276).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE277).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE278).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE279).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE280).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE281).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE282).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE283).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE284).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE285).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE286).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE287).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE288).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE289).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE290).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE291).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE292).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE293).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE294).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE295).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE296).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE297).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE298).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE299).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE300).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE301).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE302).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE303).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE304).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE305).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE306).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE307).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE308).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE309).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE310).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.OE311).getConceptId()
		
		);
	}
	
	public static List<Integer> getEarInfectionsConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ERA7).getConceptId()
		
		);
	}
	
	public static List<Integer> getUpperRespiratoryTractInfectionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.URT7).getConceptId()
		
		);
	}
	
	public static List<Integer> getAsthmaList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ASTHMA58).getConceptId()
		
		);
	}
	
	public static List<Integer> getTonsilitiesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.TONSILITIES).getConceptId()
		
		);
	}
	
	public static List<Integer> getChromosomalAbnormalitiesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.CHRAB10).getConceptId()
		
		);
	}
	
	public static List<Integer> getCongenitalAnomaliesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN20).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN21).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN22).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN23).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN24).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN25).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN26).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN27).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN28).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN29).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN30).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN31).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN32).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN33).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN34).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN35).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN36).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN37).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN38).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN39).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN40).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN41).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN42).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN43).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN44).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN45).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN46).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN47).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN48).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN49).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN50).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN51).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN52).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN53).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN54).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN55).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN56).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN57).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN58).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN59).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN60).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN61).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN62).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN63).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN64).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN65).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN66).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN67).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN68).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN69).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN70).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN71).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN72).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN73).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN74).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN75).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN76).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN77).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN78).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN79).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN80).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN81).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN82).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN83).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN84).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN85).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN86).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN87).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN88).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN89).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN90).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN91).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN92).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN93).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN94).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN95).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN96).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN97).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN98).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN99).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN100).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN101).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN121).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN120).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN122).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN123).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN124).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN125).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN126).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN127).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN128).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN129).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN130).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN131).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN132).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN133).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN134).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN135).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN136).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN137).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN138).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN139).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN140).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN141).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN142).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN143).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN144).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN145).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN146).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN147).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN148).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN149).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN150).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN151).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN152).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN153).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN154).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN155).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN156).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN157).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN158).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN159).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN160).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.COAN161).getConceptId());
	}
	
	public static List<Integer> getPneumoniaList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_1).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_2).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_3).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_4).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_5).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_6).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_7).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_8).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_9).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_10).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_11).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_12).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_13).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_14).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_15).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_16).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_17).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_18).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_19).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PNEUMONIA_20).getConceptId()
		
		);
	}
	
	public static List<Integer> getOtherDisOfRespiratorySystemList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAbortionList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getDisOfPuerperiumChildbathList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getHypertensionList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMentalDisordersList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getDentalDisordersList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getJiggersInfestationList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getDiseaseOfTheSkinList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAnthritisJointPainsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getPoisoningList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getRoadTrafficInjuriesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getOtherInjuriesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getSexualAssaultList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getViolenceRelatedInjuriesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getBurnsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getSnakeBitesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getDogBitesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getOtherBitesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
		
	}
	
	public static List<Integer> getDiabetesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getEpilepsyList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getNewlyDiagnosedHivList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getBrucellosisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getCardiovascularConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getCentralNervousSystemConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getOvrerweightList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMuscularSkeletalConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getFistulaBirthRelatedList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getNeoplamsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getPhysicalDisabilityList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getTryponomiasisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getKalazarLeishmaniasisList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getDaracuncolosisGuineaWormList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getYellowFeverList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getViralHaemorrhagicFeverList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getPlagueList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getDeathDueToRoadTrafficInjuriesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAllOtherDiseasesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getNoOfFirstAttendancesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getReAttendancesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getReferralsFromOtherHealthFacilityList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getReferralsFromOtherCommunityUnitList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getReferralsToCommunityUnitList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getMalariaInPregnancyList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getSexuallyTransmittedInfectionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAneamiaList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getEarInfectionConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getRicketsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getAutismList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getOtherConvulsiveDisordersList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getCerebralPalsyList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getOtherCentralNervousSystemConditionsList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getDeathsDuetoRoadTraficInjuriesList() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED)
		        .getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.EXTRAPULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.MULTI_DRUG_RESISTANT_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.PULMONARY_TUBERCULOSIS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_THE_GENITOURINARY_SYSTEM).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_OF_OTHER_ORGANS).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS_IN_PREGNANCY).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.ACUTE_MILIARY_TUBERCULOSIS_UNSPECIFIED).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.TUBERCULOSIS).getConceptId()
		
		);
	}
	
	public static List<Integer> getConfirmedMalariaResults() {
		return Arrays.asList(getConcept(EhrAddonsConstants._EhrAddOnConcepts.POSITIVE).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Positive_for_Plasmodium_falciparum).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Positive_for_Plasmodium_vivax).getConceptId(),
		    getConcept(EhrAddonsConstants._EhrAddOnConcepts.Positive_for_both_Plasmodium_falciparum_and_Plasmodium_vivax)
		            .getConceptId());
	}
	
	public static List<Integer> getSuspectedMalariaResults() {
		return Arrays
		        .asList(
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.NEGATIVE).getConceptId(),
		            getConcept(EhrAddonsConstants._EhrAddOnConcepts.INDETERMINATE).getConceptId(),
		            getConcept(
		                EhrAddonsConstants._EhrAddOnConcepts.Test_not_performed_due_to_lack_of_availability_of_test_materials)
		                    .getConceptId(), getConcept(EhrAddonsConstants._EhrAddOnConcepts.Procedure_not_performed)
		                    .getConceptId());
	}
}
