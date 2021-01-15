package com.fastcode.dvdrental.addons.docmgmt.application.file;

import com.fastcode.dvdrental.addons.docmgmt.application.file.dto.*;
import com.fastcode.dvdrental.commons.search.SearchCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFileAppService {
	
	//CRUD Operations
	
	CreateFileOutput create(CreateFileInput file);

    void delete(Long id);

    UpdateFileOutput update(Long id, UpdateFileInput input);

    FindFileByIdOutput findById(Long id);

    List<FindFileByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

}

