package com.bin.service;

import com.bin.entity.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * Created by richard02.zhang on 2016/8/12.
 */
@Service
public class UserService {

	private static String USER_COLLECTION = "story";

	@Autowired
	MongoTemplate mongoTemplate;

	/**
	 *
	 * @param story
	 */
	public void saveUser(Story story){

		mongoTemplate.save(story, USER_COLLECTION);

	}

	/**
	 *
	 * @param name
	 * @return
	 */
	public Story findUserByName(String name){
		return mongoTemplate.findOne(new Query(Criteria.where("name").is(name)), Story.class, USER_COLLECTION);
	}

}
