package com.fastcode.dvdrental.application.core.authorization.user;

import org.springframework.data.domain.Pageable;
import com.fastcode.dvdrental.domain.core.authorization.user.UserEntity;
import com.fastcode.dvdrental.domain.core.authorization.userpreference.UserpreferenceEntity;
import com.fastcode.dvdrental.application.core.authorization.user.dto.*;
import com.fastcode.dvdrental.commons.search.SearchCriteria;

import java.util.*;

public interface IUserAppService {
	
	//CRUD Operations
	
	CreateUserOutput create(CreateUserInput user);

    void delete(Long id);

    UpdateUserOutput update(Long id, UpdateUserInput input);

    FindUserByIdOutput findById(Long id);

    List<FindUserByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
   	UserpreferenceEntity createDefaultUserPreference(UserEntity user);
   	
   	void updateTheme(UserEntity user, String theme);
   	
   	void updateLanguage(UserEntity user, String language);
    
    void updateUserData(FindUserWithAllFieldsByIdOutput user);
	
	UserProfile updateUserProfile(FindUserWithAllFieldsByIdOutput user, UserProfile userProfile);
	
	FindUserWithAllFieldsByIdOutput findWithAllFieldsById(Long userId);
	
	UserProfile getProfile(FindUserByIdOutput user);
	 
	UserEntity getUser();
    
	FindUserByNameOutput findByUserName(String userName);
    
	FindUserByNameOutput findByEmailAddress(String emailAddress);
    
    //Join Column Parsers

	Map<String,String> parseDashboardsJoinColumn(String keysString);

	Map<String,String> parseDashboardversionsJoinColumn(String keysString);

	Map<String,String> parseReportsJoinColumn(String keysString);

	Map<String,String> parseReportversionsJoinColumn(String keysString);

	Map<String,String> parseUserpermissionsJoinColumn(String keysString);

	Map<String,String> parseUserrolesJoinColumn(String keysString);
}

