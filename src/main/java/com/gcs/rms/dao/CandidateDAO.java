package com.gcs.rms.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

import com.gcs.rms.pojo.Candidate;
import com.gcs.rms.pojo.Vacancy;

public interface CandidateDAO extends AbstractDAO<Candidate, Integer> {
    public Candidate viewCandidateDetail(Integer candidateId);

    public void createCandidate(Candidate candidate);

    public void updateCandidate(Candidate candidate);

    public void updateCandidateStatus(Candidate candidate);

    public void deleteCandidate(Candidate candidate);

    public List<Candidate> searchCandidate();

    public List<Candidate> searchCandidate(Criterion criterion);

    public List<Candidate> searchCandidateFromVacancy(Vacancy vacancy);
}
