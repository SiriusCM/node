package com.sirius.server.service.impl;

import com.sirius.server.event.Init;
import com.sirius.server.database.entity.News;
import com.sirius.server.database.entity.NewsExample;
import com.sirius.server.database.mapper.NewsMapper;
import com.sirius.server.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Service
public class NewsService implements IService {

    private Queue<News> queue = new ConcurrentLinkedQueue<>();

    @Autowired
    private NewsMapper newsMapper;

    @Init(level = 5)
    public void init() {
        List<News> list = newsMapper.selectByExample(null);
        list.forEach(news -> queue.offer(news));
    }

    public Queue<News> getNews() {
        return queue;
    }

    public void insert(News data) {
        queue.add(data);
        newsMapper.insert(data);
    }

    //@Schedule(value = "0/5 * * * * ?")
    public void deleteBefore() {
        queue.clear();
        NewsExample example = new NewsExample();
        example.createCriteria().andTimeLessThan(new Date());
        newsMapper.deleteByExample(example);
    }
}