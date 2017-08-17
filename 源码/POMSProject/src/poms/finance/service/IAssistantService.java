package poms.finance.service;

import poms.center.entity.Advice;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/7.
 */
public interface IAssistantService {
    int sendAdvice(Advice advice);

    List<Advice> getUnreadedAdvice(int stationID, int departmentID, int page);

    List<Advice> getReadedAdvice(int stationID, int departmentID, int page);

    int changePassword(int operatorID, String newPassword);
}
